package com.yunfan.blog.controller;

import com.yunfan.blog.dto.UserInfoDTO;
import com.yunfan.blog.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户相关controller
 * 包括登录、注册等
 *
 * @author fengyurong
 * @date 2020-07-22 17:23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/registerAndLogin")
    public String login(@RequestBody @Validated UserInfoDTO userInfoDTO) {
        userService.registerAndLogin(userInfoDTO);
        return "登录成功";
    }

    @PostMapping("/logout")
    public String logout(@RequestBody @Validated UserInfoDTO userInfoDTO) {
        return "登出成功";
    }
}
