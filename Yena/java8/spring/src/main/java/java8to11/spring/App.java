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
    public static void main(String[] args) {

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1,"spring boot", true));
        springClass.add(new OnlineClass(2,"spring data jpa", true));
        springClass.add(new OnlineClass(3,"spring mvc", false));
        springClass.add(new OnlineClass(4,"spring core", false));
        springClass.add(new OnlineClass(5,"rest api develoment", false));

        OnlineClass spring_boot=new OnlineClass(1,"spring boot",false);
       //레퍼레이션은 null이 기본값이므로 오류남
        //Duration studyDuration = spring_boot.getProgress().getStudyDuration();
        //에러가 나기 좋은 코드임 유의
        Optional<Progress> progress = spring_boot.getProgress();
        if (progress != null)
        System.out.println(progress.getStudyDuration());


    }
}
