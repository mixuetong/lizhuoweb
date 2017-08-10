package com.lizhuo.springInit;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

//@Component
public class SpringTestListener implements ApplicationListener<ApplicationContextEvent> {
    private Logger log = Logger.getLogger(SpringTestListener.class);
    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        log.info("testtest");
        log.info(event.getApplicationContext().getDisplayName());

//        if (contextRefreshedEvent.getApplicationContext().getParent() == null) {
//        if(event.getApplicationContext().getDisplayName().equals("Root WebApplicationContext")){
////            System.out.println("-----------------------------------");
////            System.out.println("-----------------------------------");
////            System.out.println("-----------------------------------");
//            log.info("-----------------");
//
//        }
//        log.info("sssssss" + event.toString());
//        log.error("mmmmmmmm");
    }
}
