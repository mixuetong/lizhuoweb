package com.lizhuo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizhuo.iservice.IUserService;
import com.lizhuo.model.UserDo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lizhuo6 on 2017/5/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /*
    @RequestMapping("/alluser")
    public String helloUser(ModelMap modelMap) {
        List<UserDo> list = this.userService.findAllUser();
        System.out.println("====" + list.size() + "=====");
        modelMap.addAttribute("userDo", list) ;
        return "/user_list";
    }
    */

    @RequestMapping("/alluser")
    public String helloUser(Model model) {
        List<UserDo> list = this.userService.findAllUser();
        System.out.println("====" + list.size() + "=====");
        System.out.println(list.get(0).getTel());
        System.out.println(list.get(1).getToken());
        model.addAttribute("userDo", list) ;
        model.addAttribute("time", System.currentTimeMillis()) ;
        return "/user_list";
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name){
        return "hello! your name is " + name;
    }


    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(@RequestParam String tel){
        UserDo userDo = this.userService.getUser(tel);
        return userDo.getToken();
    }

//    @RequestMapping("/addUser")
//    @ResponseBody
//    public String getUser(@RequestParam String username, @RequestParam String password){
//        UserDo userDo = new UserDo();
//        userDo.setUsername(username);
//        userDo.setPassword(password);
////        return "result:" + this.userService.addUser(userDo);
//        int result = this.userService.addUser(userDo);
//        return "result:" + result +", id:" + userDo.getId();
//    }
}
