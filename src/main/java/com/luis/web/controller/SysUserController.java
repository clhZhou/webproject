package com.luis.web.controller;

import com.luis.web.pojo.SysUser;
import com.luis.web.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author luis
 * @date 2020/3/28
 */
@Controller
@RequestMapping("/system/user")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;


    @GetMapping("/list")
    @ResponseBody
    public String list(String str) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(str);
        System.out.println(sysUserService.getByName(sysUser));
        return "登陆用户" + sysUserService.getByName(sysUser);

    }

    @GetMapping("/login")
    public String login() {
        return "login";

    }

}
