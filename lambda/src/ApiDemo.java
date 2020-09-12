/**
 * @Description:
 * @Authror wsdcoding
 */
public class ApiDemo {
    /**
     * lambda要求: SAM(Single Abstract Method)  只有一个抽象方法，而且接口也只有一个方法
     * lambda有以下几种格式：
     * 1.方法没有参数 ()->{};
     * 2.方法有参数 (参数,参数)->{};
     * 3.如果现在只有一行语句返回：(参数,参数)->语句
     * <p>
     * 方法引用形式：
     * 1.引用静态方法：类名称 :: static 方法名称
     * 2.引用某个实例对象的方法：实例化对象 :: 普通方法
     * 3.引用特定类型的方法：特定类 :: 普通方法
     * 4.引用构造方法：类名称 :: new
     *
     * @param args
     */
    //方法引用1
    public void invokeStaticMethod() {
        //1.引用String的valueOf静态方法，valueOf被函数接口Demo所接收，返回类型看实际需求
        IFunction<Integer, String> fun = String::valueOf;

        String string = fun.change(1000);
        System.out.println(string);
        System.out.println(string.length());
    }

    //方法引用2
    public void opjectMethod() {
        UpperClass<String> upper = "opjectMethod"::toUpperCase;
        System.out.println(upper.upper());
    }

    //3.引用特定类型的方法（不实例化对象即可使用特定类普通方法）  toUpperCase小写变大写
    public void thisMethod() {
        StringCompare<String> compareTo = String::compareTo;
        System.out.println(compareTo.compare("A", "a"));
    }
    //(最具有杀伤力的)4.引用构造方法：类名称 :: new
    public void constructorMethod(){
        IFunctionConstructorMethod<Person> fun = Person::new;
        System.out.println(fun.createPersonConstructor("Shiko", 23));
    }
    public static void main(String[] args) {
//        Demo demo = (string -> {
//            System.out.println("send" + string);
//        });
//        demo.send("66666");

        ApiDemo apiDemo = new ApiDemo();
        apiDemo.invokeStaticMethod();
        apiDemo.opjectMethod();
        apiDemo.thisMethod();
        apiDemo.constructorMethod();
    }
}
