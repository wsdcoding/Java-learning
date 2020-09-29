package com.wsdcoding.overrideandoverload.override;

import com.wsdcoding.overrideandoverload.Animal;

/**
 * @Description: Class Dog
 * @Authror wsdcoding
 */
public class Dog extends Animal {
    /**
     * 重写，针对子类和父类而言，子类可以重写父类可访问的方法实现自己需要的行为
     */
    public void run(){
        super.run(); //调用父类的方法
        System.out.println("dog can run");
    }
/*    public void sayHello(){
        System.out.println("dog sayHello ");
    }*/
}
