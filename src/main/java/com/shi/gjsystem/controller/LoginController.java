package com.shi.gjsystem.controller;

import com.shi.gjsystem.pojo.User;
import com.shi.gjsystem.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author PengjuCao
 */

@Controller
public class LoginController {

    @Resource
    LoginService loginService;

    @GetMapping(value = "login")
    public String login(){
        return  "/login";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session, Model model){
      User user= loginService.loginUser(username, password);
      if(user != null){
             model.addAttribute("username",username);
          //登录成功，防止表单重复提交，可以重定向到主页
            return "/index";
      }
      else {
          map.put("msg","用户名密码错误");
          return "/login";
      }
    }

}
