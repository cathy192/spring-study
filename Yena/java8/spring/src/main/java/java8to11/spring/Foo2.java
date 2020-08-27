package java8to11.spring;

public interface Foo2 {
    void printName();

    //나중에 작성한 공통 기능 메소드
    //문서화 잘해두어야하함
    /*
        @implSpec
       이 구현체는 getName()으로 가져온 문자열을 대문자로 출력한다.
     */
    default void printNameUpperCass(){
        System.out.println(getName().toUpperCase());
    }

    String getName();
}
