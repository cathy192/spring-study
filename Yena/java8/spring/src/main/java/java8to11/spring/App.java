package java8to11.spring;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App  {
    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        Thread thread =new Thread(() -> {

                System.out.println("Thread" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                    //  System.out.println("exit");
                    //return;//void라서 리턴 없음. 종료
                }

        });
        thread.start();
        System.out.println("Hello"+Thread.currentThread().getName());
        thread.join();//위에 쓰레드 끝날때 기다려줌
        System.out.println(thread+"is finished");


    }

}
