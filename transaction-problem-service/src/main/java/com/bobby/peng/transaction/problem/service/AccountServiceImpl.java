package com.bobby.peng.transaction.problem.service;

import com.bobby.peng.transaction.problem.api.AccountService;
import com.bobby.peng.transaction.problem.api.dto.AccountDTO;
import com.bobby.peng.transaction.problem.dao.AccountDao;
import com.bobby.peng.transaction.problem.domain.entity.Account;
import com.bobby.peng.transaction.problem.translator.AccountTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private DataSourceTransactionManager txManager;

    public AccountDTO findById(long accountId) {
        return AccountTranslator.buildAccountDTO(accountDao.findByAccountId(accountId));
    }

    public void incrAccountBalanceAmountWithoutCommit(long accountId) {
        //do not commit transaction
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = txManager.getTransaction(def);
        boolean flag = true;
        try {
            accountDao.incrAccountBalanceAmount(accountId);

            if(flag) throw new RuntimeException("hello");
            txManager.commit(status);
        } catch (Exception e) {
            return;
        }
    }
}
