import java.util.function.Consumer;

public class testingClass {
    public static void main(String[] args) {
       MyLambda myLambdaFunction = () -> System.out.println("Hello World");
       Consumer<String> myConsumerFunction = a -> System.out.println("Hello World");

       myLambdaFunction.foo();
       myConsumerFunction.accept("Nothing");
    }
}

interface MyLambda{
    void foo();
}
