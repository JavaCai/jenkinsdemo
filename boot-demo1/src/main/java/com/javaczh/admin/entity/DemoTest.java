package com.javaczh.admin.entity;

/**
 * @ClassName DemoTest
 * @Description
 * @Author CaiZiHao
 * @Date 2020/5/22 22:50
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO();
        userDO.setId(1);userDO.setUsername("yudaoyuanma");userDO.setPassword("buzhidao");
        // <X> 进行转换
        UserBO userBO = UserConvert.INSTANCE.convert(userDO);
        System.out.println(userBO.getId());
        System.out.println(userBO.getUsername());
        System.out.println(userBO.getPassword());
    }
}
