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
    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit( () ->{
            System.out.println("Tread"+ Thread.currentThread().getName());
        });//다음작업 들어올떄까지 프로세서가 대기하기에 shutdown으로 꺼줘야함
        executorService.shutdown();//현재 진행하는 작업을 마치고 shutdown
       // executorService.shutdownNow()//바로 다 죽임
        ScheduledExecutorService executorService2 = Executors.newSingleThreadScheduledExecutor();
        executorService2.schedule(getRunnable("hello"),3, TimeUnit.SECONDS);

    }

    private static Runnable getRunnable(String hello) {
        return () -> System.out.println(hello + Thread.currentThread().getName());
    }

}
