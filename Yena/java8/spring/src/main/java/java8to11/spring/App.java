package java8to11.spring;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App  {
    public static void main(String[] args) throws IllegalAccessException, InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello= () ->{
             Thread.sleep(200L);
            return "hello";
        };
        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.isDone());//끝났으면 true
        System.out.println("started");//get 이전까지 그냥 실행됨
        helloFuture.cancel(false);//최소되어 사라짐
        helloFuture.get();//get을 만나는 순간 멈춰서 기다림. 결과 나올 때까지. 블로킹

        System.out.println(helloFuture.isDone());
        System.out.println("ENd");
        executorService.shutdown();
        }
}
