package java8to11.spring;

import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App  {
    public static void main(String[] args) throws IllegalAccessException {

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1,"spring boot", true));

        springClass.add(new OnlineClass(5,"rest api develoment", false));

        Optional<OnlineClass> spring = springClass.stream()
                .filter(pc -> pc.getTitle().startsWith("spring"))
                .findFirst();
        //있으면 꺼내겠다. NULL 체크 안해도 됨

        spring.ifPresent(oc -> System.out.println(oc.getTitle()));
        //없으면에러 던짐
        OnlineClass onlineClass1 =  spring.orElseThrow(IllegalAccessException::new);
        System.out.println(onlineClass1.getTitle());
        //없으면 새로운 class를 만들겠다.
        OnlineClass onlineClass =  spring.orElseGet(App::creatNewClass);

        Optional<OnlineClass> onlineClass2 = spring.
                filter(oc -> oc.isClosed());

    }

    private static OnlineClass creatNewClass() {
        System.out.println("creat new class");
        return new OnlineClass(10,"new class",false);
    }

}
