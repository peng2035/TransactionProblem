package com.bobby.peng.transaction.problem.translator;

import com.bobby.peng.transaction.problem.api.dto.UserDTO;
import com.bobby.peng.transaction.problem.domain.entity.User;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class UserTranslator {

    public static User buildUser(UserDTO userDTO) {
        return new User(userDTO.getUserId(),userDTO.getName(),userDTO.getDesc());
    }

    public static UserDTO buildUserDTO(User user) {
        return new UserDTO(user.getUserId(),user.getName(),user.getDesc());
    }
}
