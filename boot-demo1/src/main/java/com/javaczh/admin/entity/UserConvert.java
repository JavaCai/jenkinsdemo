package com.javaczh.admin.entity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName UserConvert
 * @Description
 * @Author CaiZiHao
 * @Date 2020/5/22 22:24
 * @Version 1.0
 */
@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class); // <2>

    UserBO convert(UserDO userDO);
}
