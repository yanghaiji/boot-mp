package com.javayh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
  * webService启动类
  *
  * @author Dylan Yang
  */
@SpringBootApplication
@ServletComponentScan
public class WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceApplication.class, args);
    }

    /** http://localhost:8089/services/TestService?wsdl */

}

