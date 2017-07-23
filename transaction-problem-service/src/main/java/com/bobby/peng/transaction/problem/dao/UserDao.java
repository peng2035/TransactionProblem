package com.bobby.peng.transaction.problem.dao;

import com.bobby.peng.transaction.problem.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by peng2035 on 2017/7/23.
 */
public interface UserDao {

    User findByUserId(@Param("userId") long userId);

    void updateNameByUserId(@Param("userId") long userId, @Param("name") String name);
}
