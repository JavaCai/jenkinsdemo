package com.javaczh.admin.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName UserDO
 * @Description
 * @Author CaiZiHao
 * @Date 2020/5/22 22:25
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class UserDO {
    /**
     * 用户编号
     **/
    private Integer id;
    /**
     * 用户名
     **/
    private String username;
    /**
     * 密码
     **/
    private String password;
}
