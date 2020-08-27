package java8to11.spring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args){
        String[] names = {"k","white","toby"};
        //함수형 인터페이스므로 람다로 바꾸고 레퍼런스 참조가능
        //비교해가면서 인트값 넘겨주는 방법으로 정렬함
        Arrays.sort(names, String:: compareToIgnoreCase);

    //    UnaryOperator<String> hi = (s)->"hi"+s;
        //메소드 레퍼런스
        UnaryOperator<String> hi = Greeting::hi;//greeting 클래스에 static hi메소드를 쓰겠다

        // 인스턴스를 이용한 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        //생성자를 통한 참조
        //생성자의 리턴값은 그타입 자체.
        Supplier<Greeting> newGreeting= Greeting::new;
        newGreeting.get();

        //입력값을 받은 생성자 통한 참조
        Function<String, Greeting> keesunGreeting =Greeting::new;
        Greeting keesun = keesunGreeting.apply("keesun");
        System.out.println(keesun.getName());
    }

}
