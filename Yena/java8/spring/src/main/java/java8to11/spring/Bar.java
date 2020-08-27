package java8to11.spring;

//Foo에서 제공하는 기본 기능을 제공하지 않고싶음 printUpperName
public interface Bar  {
    //다이아몬드 문제

    // 서로 다른 default가 있음

    public default void printNameUpperCass() {
        System.out.println("Bar");
    }
}
