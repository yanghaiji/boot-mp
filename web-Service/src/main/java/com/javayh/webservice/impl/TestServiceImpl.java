package com.javayh.webservice.impl;

import com.javayh.entity.SysUser;
import com.javayh.mapper.SysUserMapper;
import com.javayh.webservice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * webservice测试接口实现
 *
 * webservice测试接口
 * @author Dylan Yang
 */
@WebService(serviceName = "TestService", // 与接口中指定的name一致
//targetNamespace = "http://webservice.javayh.com", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.javayh.webservice.TestService"// 接口地址
)
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public String sendMessage(String username) {
        
        return "hello "+username;
    }

    @Override
    public SysUser sendList(String username,String password,String id) {
        return sysUserMapper.updateSysUser(username,password,id);
    }

}
