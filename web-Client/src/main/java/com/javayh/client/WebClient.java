package com.javayh.client;

import com.javayh.entity.SysUser;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.namespace.QName;


/**
 * @author Dylan Yang
 * @Title: WebClient
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/1522:50
 */
@RestController
@RequestMapping(value = "/web/client/")
public class WebClient {

    @GetMapping(value = "getClient")
    public Object[] getClient(SysUser userList) {
        try {
            //本机tomcat端口为8089,参数是wsdl网址的一部分
            EndpointReference targetEPR = new EndpointReference("http://localhost:8089/services/TestService?wsdl");
            RPCServiceClient sender = new RPCServiceClient();
            Options options = sender.getOptions();
            //超时时间20s
            options.setTimeOutInMilliSeconds(2 * 20000L);
            options.setTo(targetEPR);
            /**
             * 参数:
             * 1：在网页上执行 wsdl后xs:schema标签的targetNamespace路径
             * <xs:schema  targetNamespace="http://axis2.com">
             * 2：<xs:element name="test"> ======这个标签中name的值
             */
            QName qname = new QName("http://webservice.javayh.com", "sendList");
            //方法的入参
//            String str = "我是客户端";
//            Object[] param = new Object[]{str};
            Object[] param = new Object[]{userList.getUsername(),userList.getPassword(),userList.getId()};
            //这是针对返值类型的
            Class<?>[] types = new Class[]{SysUser.class};
            /**
             * RPCServiceClient类的invokeBlocking方法调用了WebService中的方法。
             * invokeBlocking方法有三个参数
             * 第一个参数的类型是QName对象，表示要调用的方法名；
             * 第二个参数表示要调用的WebService方法的参数值，参数类型为Object[]；
             * 第三个参数表示WebService方法的返回值类型的Class对象，参数类型为Class[]。
             * 当方法没有参数时，invokeBlocking方法的第二个参数值不能是null，而要使用new Object[]{}。
             */
            Object[] response = sender.invokeBlocking(qname, param, types);
            System.out.println(response[0]);
            return response;
        } catch (AxisFault e) {
            e.printStackTrace();
        }
        return null;
    }
}

