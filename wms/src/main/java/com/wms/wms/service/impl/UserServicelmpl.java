package com.wms.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.wms.entity.User;
import com.wms.wms.mapper.UserMapper;
import com.wms.wms.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl extends ServiceImpl<UserMapper, User> implements UserService {
}
