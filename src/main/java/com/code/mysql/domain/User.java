package com.code.mysql.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author paoPao
 * @Date 2022/11/11
 * @Description
 */
@Data
public class User {
    private long id;
    private String cUserId;
    private String cName;
    private Date createTime;
}
