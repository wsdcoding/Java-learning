/**
 * @Description:
 * @Authror wsdcoding
 */

/**
 * //@FunctionalInterface该注解声明是函数式接口，每一次都这样就很麻烦，
 * 可以直接使用系统自带的接口：java.util.function 开发包里面可以直接使用函数式接口
 * 有以下几个重要核心接口：
 * 1.功能型函数式接口：IntFunction<T,R>
 * @param <P>
 * @param <R>
 */
@FunctionalInterface
interface IFunction<P, R>{
    //P 参数   R 返回值
    public R change(P p);
}

