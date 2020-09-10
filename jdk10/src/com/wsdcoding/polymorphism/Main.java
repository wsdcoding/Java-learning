package com.wsdcoding.polymorphism;

/**
 * @Description: Java多态学习： 多态是面向对象中的第三大主要特征,
 * 多态性是在继承的基础上扩展出来的概念，也就是说可以实现父子类之间的相互转换处理
 * Java中实现多态的方式主要有两种
 * 1. 方法的多态性
 * A>方法重载:同个方法可以根据传入的参数类型或者个数的不同实现不同功能的执行
 * B>方法复写：同个方法可能根据使用子类的不同有不同的实现
 * <p>
 * 2. 对象的多态性:父子实例之间的转换处理，有两种模式
 * A.对象向上转型（接受或返回参数的统一性，利于代码的维护）：父类 父类实例 = 子类实例；---自动完成转换。
 * B.对象向下转型：子类 子类实例 = （子类）父类实例 ---强制完成转换，往往在考虑子类特殊功能（或者子类对父类功能扩充）的时候考虑向下转型
 * @Authror wsdcoding
 */
class MessageTest {
    /**
     * 方法覆写
     */
    public void test1() {
        DataBaseMessage dataBaseMessage = new DataBaseMessage();
        dataBaseMessage.print();
    }

    /**
     * 向上转型：有什么用处？
     */
    public void test2() {
        Message dataBaseMessage = new DataBaseMessage();
        System.out.println("向上转型：---------------------");
        dataBaseMessage.print();
    }

    /**
     * 向上转型：有什么用处？
     * 其特点主要在于：可以对参数进行统一的设计，
     */
    public void test3() {
        fun(new DataBaseMessage());    // Message msg = new DataBaseMessage()
        fun(new WebServerMessage());    // Message msg = new WebServerMessage()
    }

    public static void fun(Message msg) {    // 不管现在传递是那一个子类都可以接收
        msg.print();
    }


    public void test4() {
        fund(new DataBaseMessage());    // Message msg = new DataBaseMessage()
        funw(new WebServerMessage());    // Message msg = new WebServerMessage()
    }

    public static void fund(DataBaseMessage msg) {    // 不管现在传递是那一个子类都可以接收
        msg.print();
    }

    public static void funw(WebServerMessage msg) {    // 不管现在传递是那一个子类都可以接收
        msg.print();
    }
}

/**
 * 向上转型：有什么用处？
 * 向下转型主要特点在于需要使用到一些子类自己特殊的定义处理, 向下转型其实不是一件安全的事情
 * 因为在向下之前一定会发生 向上转型,两个没有任何关系的实例如果要发生强制转换关系，那就会发生ClassCastException异常
 * 为了保证向下转型的正确性，在转型之前需要用到 instanceof 关键字进行判断，判断某个实例是某个类的的子对象？
 * 语法：对象  instanceof 类
 * 该判断是一个返回boolean类型，true表示实例是指定类对象
 */
public class Main {
    public static void main(String[] args) {
        MessageTest messageTest = new MessageTest();
        //messageTest.test4();

        /**
         * 向下转型代码
         */
/*        System.out.println("---------- 正常状态下的超人应该是一个普通人的状态 --------------") ;
        Person per = new SuperMan() ; // 向上转型
        per.print() ;
        System.out.println("---------- 外星怪兽狗骚扰地球，准备消灭人类 --------------") ;
        SuperMan man = (SuperMan) per ;		// 向下转型,,,
        System.out.println(man.fly()) ;
        System.out.println(man.fire()) ;*/

        /**
         * instanceof 语法
         */
//        Person per = new Person() ; // 不转型
//        System.out.println(per instanceof Person) ;	// true
//        System.out.println(per instanceof SuperMan) ;	// false
        /**
         * 在开发过程中，如果要执行向下转型，最好先判断一次
         */
//        Person per = new SuperMan() ; // 向下转型 1
//        System.out.println(per instanceof Person) ;	// true
//        System.out.println(per instanceof SuperMan) ;	// true

        /**
         * 在进行一些完善性的程序开发过程之中，对于转型之前一定要使用instanceof判断
         */
        Person per = new SuperMan(); // 向下转型 2
        if (per instanceof SuperMan) {
            SuperMan man = (SuperMan) per;
            System.out.println(man.fly());
            System.out.println(man.fire());
        }
    }
}
