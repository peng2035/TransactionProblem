package com.bobby.peng.transaction.problem.controller;

import com.bobby.peng.transaction.problem.common.CommonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Controller
public class AccountController {

    @RequestMapping("/account/{accountId}")
    @ResponseBody
    public CommonResponse findByAccountId(@PathVariable long accountId) {
        return new CommonResponse(200,String.valueOf(accountId));
    }


    @RequestMapping(value = "/account/{accountId}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResponse incrMoneyByAccountId(@PathVariable long accountId) {
        return new CommonResponse(200,"hello");
    }

}
