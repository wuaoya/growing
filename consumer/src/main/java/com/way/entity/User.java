package com.way.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
@TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String age;
}
