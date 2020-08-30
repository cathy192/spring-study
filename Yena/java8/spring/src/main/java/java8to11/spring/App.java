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
    ExecutorService executorService= Executors.newFixedThreadPool(5);
    CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
        System.out.println("Hello" + Thread.currentThread().getName());
        return "Hello";
    }, executorService).thenRunAsync(() -> {
        System.out.println(Thread.currentThread().getName());
    },executorService);
        future.get();
        executorService.shutdown();
    }


}
