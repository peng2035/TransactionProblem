package com.bobby.peng.transaction.problem.api.dto;

import java.math.BigDecimal;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class AccountDTO {
    private long accountId;

    private BigDecimal balanceAmount;

    private long userId;

    public AccountDTO() {
    }

    public AccountDTO(long accountId, BigDecimal balanceAmount, long userId) {
        this.accountId = accountId;
        this.balanceAmount = balanceAmount;
        this.userId = userId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
