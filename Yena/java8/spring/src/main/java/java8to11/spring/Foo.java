package java8to11.spring;

import java.lang.module.FindException;
import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
        UnaryOperator<Integer> plus =(i) -> i+10;

    }
    private void run(){
      final  int basenumber = 10;
    //local class 로컬변수 참조
      class LocalClass{
           void print() {
               int basenumber =11;
               System.out.println(basenumber); //11출력됨
           }
      };
           //익명 클래스에서 로컬 변수 참조
           Consumer<Integer>  integerConsumer = new Consumer<Integer>() {
               @Override
               public void accept(Integer  basenumber) {
                   System.out.println(basenumber);
               }
           };
        //람다에서 로컬 변수 참조.
        IntConsumer privsteInt = (i) ->{ //i ->basenumber//변수를 재정의해서 에러

        System.out.println(i+basenumber);
        };
        privsteInt.accept(10);
        basenumber++;//effective final이 아니라서 에러남
    }
}
