package com.bobby.peng.transaction.problem.dao;

import com.bobby.peng.transaction.problem.domain.entity.Account;
import org.apache.ibatis.annotations.Param;

/**
 * Created by peng2035 on 2017/7/23.
 */
public interface AccountDao {

    Account findByAccountId(@Param("accountId") long accountId);

}
