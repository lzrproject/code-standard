package com.code.mysql.mapper;

import com.code.mysql.domain.User;

/**
 * @Author paoPao
 * @Date 2022/11/11
 * @Description
 */
public interface UserMapper {
    int insertBatch(User user);
}
