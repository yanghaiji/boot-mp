package com.javayh.webservice;

import com.javayh.entity.SysUser;
import com.javayh.vo.SysUserVo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
  * webservice测试接口
  * @author Dylan Yang
  */
@WebService(name = "TestService"// 暴露服务名称
//targetNamespace = "http://webservice.javayh.com"// 命名空间,一般是接口的包名倒序
)
public interface TestService {
    
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String sendMessage(@WebParam(name = "username") String username);

    @WebMethod
    @WebResult(name = "String",targetNamespace = "")
    SysUser sendList(@WebParam(name = "username") String username,@WebParam(name = "password")String password,@WebParam(name = "id")String id);
}