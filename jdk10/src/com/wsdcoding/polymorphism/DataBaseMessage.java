package com.wsdcoding.polymorphism;

/**
 * @Description: 数据库连接消息
 * @Authror wsdcoding
 */
public class DataBaseMessage extends Message {
    /**
     * 方法覆写
     */
    public void print(){
        System.out.println("MySQl数据库连接信息");
    }
}
