package com.wsdcoding.overrideandoverload.overrload;

/**
 * @Description: 重载
 * @Authror wsdcoding
 */

/**
 * 重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
 *
 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
 *
 * 最常用的地方就是构造器的重载。
 *
 * 重载规则:
 *
 * 被重载的方法必须改变参数列表(参数个数或类型不一样)；
 * 被重载的方法可以改变返回类型；
 * 被重载的方法可以改变访问修饰符；
 * 被重载的方法可以声明新的或更广的检查异常；
 * 方法能够在同一个类中或者在一个子类中被重载。
 * 无法以返回值类型作为重载函数的区分标准。
 */
public class Cat {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public String test(String s){
        return "string2";
    }
    public String test (int a, String s){
        return "test3";
    }
    public String test (String s, int a){
        return "test4";
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.test());
        System.out.println(cat.test("fangfa2"));
        System.out.println(cat.test(1, "fangfa3"));
        System.out.println(cat.test("方法4", 4));
    }
}
