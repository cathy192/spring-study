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
        Date date = new Date();
        Instant instant = date.toInstant();
        Date newDAte =Date.from(instant);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime1 = gregorianCalendar.toInstant()
                .atZone(ZoneId.systemDefault());//인스턴스만 있으면 다 바꿀수있음
        //gragorian
        GregorianCalendar from = GregorianCalendar.from(dateTime1);
        LocalDateTime dateTime = LocalDateTime.now();
        dateTime.plus(10, ChronoUnit.DAYS);//기존 인스턴스 변경 안함
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();//예전에서 최근
        TimeZone.getTimeZone(zoneId); //최근에서 예전
        //내가 원하는 데로 포메팅
        DateTimeFormatter mmddyyy =DateTimeFormatter.ofPattern("MM/dd/yyy");
        System.out.println(dateTime.format(mmddyyy));
        //파싱
        LocalDate parse =LocalDate.parse("07/15/1982",mmddyyy);
        System.out.println(parse);
    }


}
