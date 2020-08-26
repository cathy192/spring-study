package java8to11.spring;

import java.lang.module.FindException;
import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        UnaryOperator<Integer> plus =(i) -> i+10;

    }
}
