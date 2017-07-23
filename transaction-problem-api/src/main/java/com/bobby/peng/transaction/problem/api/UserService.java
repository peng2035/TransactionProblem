package com.bobby.peng.transaction.problem.api;

import com.bobby.peng.transaction.problem.api.dto.UserDTO;

/**
 * Created by peng2035 on 2017/7/23.
 */
public interface UserService {

    UserDTO findById(long userId);

}
