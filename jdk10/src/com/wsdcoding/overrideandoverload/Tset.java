package com.wsdcoding.overrideandoverload;

import com.wsdcoding.overrideandoverload.override.Dog;

/**
 * @Description:
 * @Authror wsdcoding
 */


public class Tset {
    /**
     * 重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
     *
     * 重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。
     *
     * 重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。例如： 父类的一个方法申明了一个检查异常 IOException，但是在重写这个方法的时候不能抛出 Exception 异常，因为 Exception 是 IOException 的父类，只能抛出 IOException 的子类异常。
     *
     * 在面向对象原则里，重写意味着可以重写任何现有方法
     * ###########重写规则如下
     * 参数列表与被重写方法的参数列表必须完全相同。
     *
     * 返回类型与被重写方法的返回类型可以不相同，但是必须是父类返回值的派生类（java5 及更早版本返回类型要一样，java7 及更高版本可以不同）。
     *
     * 访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为 public，那么在子类中重写该方法就不能声明为 protected。
     *
     * 父类的成员方法只能被它的子类重写。
     *
     * 声明为 final 的方法不能被重写。
     *
     * 声明为 static 的方法不能被重写，但是能够被再次声明。
     *
     * 子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为 private 和 final 的方法。
     *
     * 子类和父类不在同一个包中，那么子类只能够重写父类的声明为 public 和 protected 的非 final 方法。
     *
     * 重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
     *
     * 构造方法不能被重写。
     *
     * 如果不能继承一个类，则不能重写该类的方法
     */
    void voidOverride() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.run();
        dog.run();

        dog.sayHello();
    }

    void voidOverload(){

    }
    public static void main(String[] args) {
        Tset test = new Tset();
        test.voidOverride();
    }
}
