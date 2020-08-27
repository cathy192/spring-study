package java8to11.spring;

public class DefaultFoo  implements Foo2,Bar{

String name;


    public DefaultFoo(String name) {
        this.name = name;
    }
    //재정의
    @Override
    public void printNameUpperCass() {
        System.out.println(this.name.toUpperCase());
    }
    //컴파일 에러 발생함.
    //default String toSting(){ }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
    @Override
    public String getName(){
        return  this.name;
    }
}
