package com.bobby.peng.transaction.problem.service;

import com.bobby.peng.transaction.problem.api.AccountService;
import com.bobby.peng.transaction.problem.api.dto.AccountDTO;
import com.bobby.peng.transaction.problem.dao.AccountDao;
import com.bobby.peng.transaction.problem.domain.entity.Account;
import com.bobby.peng.transaction.problem.translator.AccountTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountDTO findById(long accountId) {
        return AccountTranslator.buildAccountDTO(accountDao.findByAccountId(accountId));
    }


}
