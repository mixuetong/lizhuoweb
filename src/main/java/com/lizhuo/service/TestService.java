package com.lizhuo.service;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service
public class TestService {
    private static Logger log = Logger.getLogger(TestService.class);
    private String message = "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init(){
//        System.out.println("initinitinit");
        log.info("initinit");
        message = message + "456";
        log.info(message);
    }

    @PreDestroy
    public void dostory(){
//        System.out.println("dostory");
        log.info("dostorydostory");
    }

}
