package com.wms.wms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.wms.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> listAll();
}
