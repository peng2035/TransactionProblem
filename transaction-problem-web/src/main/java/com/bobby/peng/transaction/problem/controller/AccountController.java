package com.bobby.peng.transaction.problem.controller;

import com.alibaba.fastjson.JSON;
import com.bobby.peng.transaction.problem.api.AccountService;
import com.bobby.peng.transaction.problem.api.UserService;
import com.bobby.peng.transaction.problem.common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/{accountId}")
    @ResponseBody
    public CommonResponse findByAccountId(@PathVariable long accountId) {
        return new CommonResponse(200, JSON.toJSONString(accountService.findById(accountId)));
    }


    @RequestMapping(value = "/account/{accountId}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResponse incrMoneyByAccountId(@PathVariable long accountId) {
        accountService.incrAccountBalanceAmountWithoutCommit(accountId);

        return new CommonResponse(200, JSON.toJSONString(accountService.findById(accountId)));
    }

}
