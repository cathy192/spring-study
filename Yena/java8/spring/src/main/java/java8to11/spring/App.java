package java8to11.spring;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App  {
    public static void main(String[] args) {

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1,"spring boot", true));
        springClass.add(new OnlineClass(2,"spring data jpa", true));
        springClass.add(new OnlineClass(3,"spring mvc", false));
        springClass.add(new OnlineClass(4,"spring core", false));
        springClass.add(new OnlineClass(5,"rest api develoment", false));


        //collection으로
        System.out.println("spring 으로 시작하는 수업");
        springClass.stream().filter(oc ->oc.getTitle().startsWith("spring"))
                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("close 되지 않은 수업");
        springClass.stream().filter( oc -> !oc.isClosed())
                .forEach(oc -> System.out.println(oc.getId()));
        // 스태틱 메소드를 이용해서 조금더 단축시키기
        springClass.stream().filter(Predicate.not(OnlineClass::isClosed))
                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
        // map 중계형 오퍼레이터 사용 map을 통해 스트림으로 만들어줌
        springClass.stream().map(OnlineClass::getTitle)
                .forEach(System.out::println);//문자열이 forEach로 들어옴옴



        List<OnlineClass> javaClass = new ArrayList<>();
        springClass.add(new OnlineClass(6,"the Java, Test", true));
        springClass.add(new OnlineClass(7,"the Java, Code manipulate", true));
        springClass.add(new OnlineClass(8,"the Java, 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClass);
        keesunEvents.add(javaClass);

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream()
                .flatMap(Collection::stream)
                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        Stream.iterate(10, i -> i+1)  ////중계형.
                .skip(10)  //앞에 10개 제외
                .limit(10) // 10개만 출력
        .forEach(System.out::println);

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean test = javaClass.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
        System.out.println(test);

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        springClass.stream().filter(poc -> poc.getTitle().contains("spring"))
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList());
        springClass.forEach(System.out::println);
    }
}
