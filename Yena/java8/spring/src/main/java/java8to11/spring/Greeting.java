package java8to11.spring;

public class Greeting {
    private String name;

    public Greeting(){ //비어있는 생성자

    }
    public Greeting(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public String hello(String name){
        return "hello"+ name;
    }
    public static  String hi(String name){
        return "hi"+name ;
    }
}
