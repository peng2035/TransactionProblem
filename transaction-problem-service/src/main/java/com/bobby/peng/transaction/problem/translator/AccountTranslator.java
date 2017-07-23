package com.bobby.peng.transaction.problem.translator;

import com.bobby.peng.transaction.problem.api.dto.AccountDTO;
import com.bobby.peng.transaction.problem.domain.entity.Account;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class AccountTranslator {

    public static Account buildAccount(AccountDTO accountDTO) {
        return new Account(accountDTO.getAccountId(),accountDTO.getBalanceAmount(),accountDTO.getUserId());
    }

    public static AccountDTO buildAccountDTO(Account account) {
        return new AccountDTO(account.getAccountId(),account.getBalanceAmount(),account.getUserId());
    }

}
