package com.yunfan.blog.controller;

import com.yunfan.blog.dto.UserInfoDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关controller
 * 包括登录、注册等
 *
 * @author fengyurong
 * @date 2020-07-22 17:23
 */
@RestController("/user")
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody @Validated UserInfoDTO userInfoDTO) {
        return "登录成功";
    }

    @PostMapping("/logout")
    public String logout(@RequestBody @Validated UserInfoDTO userInfoDTO) {
        return "登出成功";
    }
}
