/**
 * @Description:
 * @Authror wsdcoding
 */
class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "姓名" + this.name + "年龄" + this.age;
    }
}

@FunctionalInterface
public interface IFunctionConstructorMethod<R> {
    public R createPersonConstructor(String string, int age);
}
