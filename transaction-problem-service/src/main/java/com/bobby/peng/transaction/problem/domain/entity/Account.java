package com.bobby.peng.transaction.problem.domain.entity;

import java.math.BigDecimal;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class Account {

    private long accountId;

    private BigDecimal balanceAmount;

    private long userId;

    public Account() {

    }

    public Account(long accountId, BigDecimal balanceAmount, long userId) {
        this.accountId = accountId;
        this.balanceAmount = balanceAmount;
        this.userId = userId;
    }

    public long getAccountId() {
        return accountId;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public long getUserId() {
        return userId;
    }

}
