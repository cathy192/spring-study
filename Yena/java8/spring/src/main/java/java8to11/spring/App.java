package java8to11.spring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App  {
    public static void main(String[] args){
        Foo2 foo = new DefaultFoo("keesun");
        foo.printName();
        foo.printNameUpperCass();
    }

}
