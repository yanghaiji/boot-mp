package com.javayh.config;

import com.javayh.webservice.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * cxf配置
 *
 * webservice测试接口
 * @author Dylan Yang
 */
@Configuration
public class CxfConfig {
    
    @Autowired
    private Bus bus;
    
    @Autowired
    private TestService testService;
    
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, testService);
        endpoint.publish("/TestService");
        return endpoint;
    }
}
