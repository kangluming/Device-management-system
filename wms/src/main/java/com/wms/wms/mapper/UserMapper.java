package com.wms.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> listAll();
}
