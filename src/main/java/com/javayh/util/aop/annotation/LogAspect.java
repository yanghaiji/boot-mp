package com.javayh.util.aop.annotation;

import com.javayh.util.aop.enums.LogAspectType;
import com.javayh.util.aop.enums.LogAspectUnit;

import java.lang.annotation.*;

/**
 * @author Dylan Yang
 * @Title: LogAspect
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/2217:49
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAspect {
    /**
     * 方法描述,可使用占位符获取参数:{{tel}}
     */
    String detail() default "";

    /**
     * 日志等级:自己定，此处分为1-9
     */
    int level() default 0;

    /**
     * 操作类型(enum):主要是select,insert,update,delete
     */
    LogAspectType logAspectType() default LogAspectType.UNKNOWN;

    /**
     * 被操作的对象(此处使用enum):可以是任何对象，如表名(user)，或者是工具(redis)
     */
    LogAspectUnit logAspectUnit() default LogAspectUnit.UNKNOWN;

}

