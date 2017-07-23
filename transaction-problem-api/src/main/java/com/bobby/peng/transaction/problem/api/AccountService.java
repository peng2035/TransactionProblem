package com.bobby.peng.transaction.problem.api;

import com.bobby.peng.transaction.problem.api.dto.AccountDTO;

/**
 * Created by peng2035 on 2017/7/23.
 */
public interface AccountService {

    AccountDTO findById(long accountId);

}
