package com.bobby.peng.transaction.problem.controller;

import com.alibaba.fastjson.JSON;
import com.bobby.peng.transaction.problem.api.UserService;
import com.bobby.peng.transaction.problem.common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{userId}")
    public CommonResponse findById(@PathVariable long userId) {
        return new CommonResponse(200, JSON.toJSONString(userService.findById(userId)));
    }
}
