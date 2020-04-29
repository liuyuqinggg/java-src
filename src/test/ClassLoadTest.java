package test;

public class ClassLoadTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.m);
        System.out.println(System.getProperty("java.class.path"));
    }
}

class Person{

    static {
        System.out.println("static方法执行");
        m = 100;
    }
    static int m = 300;
    Person(){
        System.out.println("构造方法执行");
    }
}
