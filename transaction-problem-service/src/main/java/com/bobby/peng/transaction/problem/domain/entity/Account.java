package com.bobby.peng.transaction.problem.domain.entity;

import java.math.BigDecimal;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class Account {

    private long accountId;

    private BigDecimal balancedAmount;

    private long userId;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getBalancedAmount() {
        return balancedAmount;
    }

    public void setBalancedAmount(BigDecimal balancedAmount) {
        this.balancedAmount = balancedAmount;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
