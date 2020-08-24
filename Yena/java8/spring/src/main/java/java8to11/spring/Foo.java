package java8to11.spring;

public class Foo {
    public static void main(String[] args) {
        //익명 내부 클래스 -> 람다 식
        /*RunSomething runSomething = (num) -> {
         //   System.out.println("Hello");
            return num + 10;//입력받은 값이 동일한 경우 결과가 같아야함
        };
        System.out.println(runSomething.doIt(1));

    }*/

    RunSomething runSomething=new RunSomething() {
        final int baseNumber=10;
        @Override
        public int doIt(int num) {
            baseNumber++;
            return num+baseNumber;
        }
    };
        
    }
}
