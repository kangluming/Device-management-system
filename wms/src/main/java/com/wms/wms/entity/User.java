package com.wms.wms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {
    private int id;
    private String no;
    private String name;
    private String password;
    private int sex;
    private int rollID;
    private String phone;
    @TableField("isvalid")
    private String isValid;
}
