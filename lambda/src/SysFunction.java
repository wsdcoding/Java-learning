import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Description: //@FunctionalInterface该注解声明是函数式接口，
 * 每一次都这样就很麻烦，可以直接使用系统自带的接口：
 * java.util.function 开发包里面可以直接使用函数式接口  *
 * 有以下几个重要核心接口：
 * 1.功能型函数式接口：IntFunction<T,R> 即 接收一个参数，返回一个参数
 * 2.消费型函数式接口：Consumer<T>,     只能够进行数据处理操作，而没有任何返回
 * 3.供给型函数式接口：Supplier<T>,     没接收参数，但是有返回值，如 public String toLowerCase();
 * 4.断言型函数式接口：Predicate<T>,    进行判断处理，数据要判断，判断就断言
 * @Authror wsdcoding
 */
public class SysFunction {
    public void test() {
        //引用实例化对象的方式 startsWith
        Function<String, Boolean> fun = "**1使用实例化对象方式"::startsWith;
        System.out.println(fun.apply("**"));
    }

    public void test1() {
        //引用实例化对象的方式 startsWith
        Consumer<String> con = System.out::print;
        con.accept("消费打印了******/n");
    }

    public void test2() {
        Supplier<String> sup = "www.wsdcoding.com"::toLowerCase;
        System.out.println(sup.get());
    }

    public void test3() {
        Predicate<String> pre = "wsdcoding.com"::equalsIgnoreCase;
        System.out.println(pre.test("wsdcoding"));
    }

    public static void main(String[] args) {
        SysFunction sysFunction = new SysFunction();
        sysFunction.test();
        sysFunction.test1();
        sysFunction.test2();
        sysFunction.test3();
    }
}
