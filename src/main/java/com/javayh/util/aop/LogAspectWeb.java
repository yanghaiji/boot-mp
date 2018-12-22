package com.javayh.util.aop;

import com.alibaba.fastjson.JSON;
import com.javayh.util.aop.annotation.LogAspect;
import com.javayh.util.aop.model.LogAspectModel;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Dylan Yang
 * @Title: WebLogAspect
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/2217:54
 */
@Aspect
@Component
public class LogAspectWeb {

    /**
     * 此处的切点是注解的方式，也可以用包名的方式达到相同的效果
     * '@Pointcut("execution(* com.wwj.springboot.service.impl.*.*(..))")'
     */
    @Pointcut("@annotation(com.javayh.util.aop.annotation.LogAspect)")
    public void operationLog(){}


    /**
     * 环绕增强，相当于MethodInterceptor
     */
    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object res = null;
        long time = System.currentTimeMillis();
        try {
            res =  joinPoint.proceed();
            time = System.currentTimeMillis() - time;
            return res;
        } finally {
            try {
                //方法执行完成后增加日志
                addOperationLog(joinPoint,res,time);
            }catch (Exception e){
                System.out.println("LogAspect 操作失败：" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void addOperationLog(JoinPoint joinPoint, Object res, long time){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        LogAspectModel logAspectModel = new LogAspectModel();
        logAspectModel.setRunTime(time);
        logAspectModel.setReturnValue(JSON.toJSONString(res));
        logAspectModel.setId(UUID.randomUUID().toString());
        logAspectModel.setArgs(JSON.toJSONString(joinPoint.getArgs()));
        logAspectModel.setCreateTime(new Date());
        logAspectModel.setMethod(signature.getDeclaringTypeName() + "." + signature.getName());
//        logAspectModel.setUserId("#{currentUserId}");
//        logAspectModel.setUserName("#{currentUserName}");
        LogAspect annotation = signature.getMethod().getAnnotation(LogAspect.class);
        if(annotation != null){
            logAspectModel.setLevel(annotation.level());
            logAspectModel.setDescribe(getDetail(((MethodSignature)joinPoint.getSignature()).getParameterNames(),joinPoint.getArgs(),annotation));
            logAspectModel.setOperationType(annotation.logAspectType().getValue());
            logAspectModel.setOperationUnit(annotation.logAspectUnit().getValue());
        }
        //TODO 这里保存日志
        System.out.println("记录日志:" + logAspectModel.toString());
//        operationLogService.insert(logAspectModel);
    }

    /**
     * 对当前登录用户和占位符处理
     * @param argNames 方法参数名称数组
     * @param args 方法参数数组
     * @param annotation 注解信息
     * @return 返回处理后的描述
     */
    private String getDetail(String[] argNames, Object[] args, LogAspect annotation){

        Map<Object, Object> map = new HashMap<>(4);
        for(int i = 0;i < argNames.length;i++){
            map.put(argNames[i],args[i]);
        }

        String detail = annotation.detail();
        try {
            detail =/*'" + "#{currentUserName}*/ "LogAspect" + "------>" + annotation.detail();
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                Object k = entry.getKey();
                Object v = entry.getValue();
                detail = detail.replace("{{" + k + "}}", JSON.toJSONString(v));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return detail;
    }

    @Before("operationLog()")
    public void doBeforeAdvice(JoinPoint joinPoint){
        System.out.println("进入方法前执行.....");

    }

    /**
     * 处理完请求，返回内容
     * @param ret
     */
    @AfterReturning(returning = "ret", pointcut = "operationLog()")
    public void doAfterReturning(Object ret) {
        System.out.println("方法的返回值 : " + ret);
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing("operationLog()")
    public void throwss(JoinPoint jp){
        System.out.println("方法异常时执行.....");
    }


    /**
     * 后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
     */
    @After("operationLog()")
    public void after(JoinPoint jp){
        System.out.println("方法最后执行.....");
    }

}

