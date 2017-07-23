package com.bobby.peng.transaction.problem.controller;

import com.alibaba.fastjson.JSON;
import com.bobby.peng.transaction.problem.api.UserService;
import com.bobby.peng.transaction.problem.common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{userId}")
    @ResponseBody
    public CommonResponse findById(@PathVariable long userId) {
        return new CommonResponse(200, JSON.toJSONString(userService.findById(userId)));
    }

    @RequestMapping("/user/{userId}/name/{name}")
    @ResponseBody
    public CommonResponse findById(@PathVariable long userId,@PathVariable String name) {
        try {
            userService.updateNameByUserId(userId,name);
        } catch (Exception e) {
            return new CommonResponse(500, "更新失败", JSON.toJSONString(userService.findById(userId)));
        }

        return new CommonResponse(200, JSON.toJSONString(userService.findById(userId)));
    }
}
