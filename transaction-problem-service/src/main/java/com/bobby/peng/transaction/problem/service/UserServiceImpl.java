package com.bobby.peng.transaction.problem.service;

import com.bobby.peng.transaction.problem.api.UserService;
import com.bobby.peng.transaction.problem.api.dto.UserDTO;
import com.bobby.peng.transaction.problem.dao.UserDao;
import com.bobby.peng.transaction.problem.translator.UserTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peng2035 on 2017/7/23.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public UserDTO findById(long userId) {
        return UserTranslator.buildUserDTO(userDao.findByUserId(userId));
    }

}
