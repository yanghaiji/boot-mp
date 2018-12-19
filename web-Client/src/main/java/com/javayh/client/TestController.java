package com.javayh.client;

import com.javayh.TestClient.TestService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Yang
 * @Title: TestController
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/1922:15
 */
@RestController
@RequestMapping(value = "/service/client/")
public class TestController {

    @GetMapping(value = "getWebserice")
    public String getWebserice(String username){
        //创建JaxWsProxyFactoryBean对象，用于几首服务
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        //绑定wsdl地址
        factoryBean.setAddress("http://localhost:8089/services/TestService");
        //绑定本地生成的接口类
        factoryBean.setServiceClass(TestService.class);
        //创建代理
        TestService testService = (TestService)factoryBean.create();
        System.out.println("发布成功！");
        //远程调用服务
        return testService.sendMessage(username);
    }
}

