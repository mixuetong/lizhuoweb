package com.lizhuo.controller;

import com.lizhuo.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DashboardController {
    private static Logger log = Logger.getLogger(DashboardController.class);
//    @Autowired
//    private TestService testservice;

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
        log.info("==========dashboard===========");
//        log.info(testservice.getMessage());
        return "/dashboard";
    }
}
