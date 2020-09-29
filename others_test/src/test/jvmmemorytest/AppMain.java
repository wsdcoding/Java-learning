package test.jvmmemorytest;

/**
 * @Description:
 * @Authror wsdcoding
 */
public class AppMain { //运行时，JVM把appMain的代码全部丢进方法区
    public static void main(String[] args) {
        // test1 是引用，所以放到堆里，Sample自定义对象应该放到堆里
        Spample test1 = new Spample("test1"); //new Sample 实例后，name 引用放入栈里，name对应的String放入对象里面
        Spample test2 = new Spample("test1");
    }
}

class Spample{ //运行时，JVM把appMain的代码全部丢进方法区
    private String name;

    public Spample(String name) {
        this.name = name;
    }
    public void printName(){ //在没有对象的时候，printName方法sample类被放入方法区了
        System.out.println(name);
    }
}