package com.wsdcoding.polymorphism;

/**
 * @Description: 消息类
 * @Authror wsdcoding
 */
public class Message {
    public void print(){
        System.out.println("消息发送器");
    }
    /**
     * 方法重载
     */
    public void print(String string){
        System.out.println("方法重写");
    }
}
