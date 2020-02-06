package com.imbytecat.generator.mybatisplus.service.impl;

import com.imbytecat.generator.mybatisplus.pojo.User;
import com.imbytecat.generator.mybatisplus.dao.UserMapper;
import com.imbytecat.generator.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author imByteCat
 * @since 2020-02-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


}
