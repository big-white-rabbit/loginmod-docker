package com.yinwang.loginmod.mapper;

import com.yinwang.loginmod.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectByIdAndPassword(Integer id, String password);
}
