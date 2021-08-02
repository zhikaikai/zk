package com.hogae.admin.service;

import com.hogae.admin.api.IUserService;
import com.hogae.admin.mapper.AdminUserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class UserService implements IUserService {

    @Autowired
    AdminUserMapper userMapper;

    @Override
    public AdminUserMapper getMapper() {
        return userMapper;
    }
}
