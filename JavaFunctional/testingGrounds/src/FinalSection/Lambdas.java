package FinalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String args[]){
        MyLambda myLambdaFunction = () -> System.out.println("Hello World");
        //The 'myLambdaFucntion' mimics the method foo in the interface Mylambda
        //The is no input in the lambda because foo doesn't have a input
        //The interface used by the lambda can only have one method

        math myMathMultiply = (int a, int b) -> a*b;
        math myMathSubtract = (int a, int b) -> a-b;
        math myMathAddition = (int a, int b) -> a+b;
        math myMathDivide = (int a, int b) -> a/b;

        myLambdaFunction.foo();
        System.out.println(myMathMultiply.operation(2,3));
        System.out.println(myMathSubtract.operation(4,3));
        System.out.println(myMathAddition.operation(5,6));
        System.out.println(myMathDivide.operation(6,3));

    }
}

interface MyLambda{
    void foo();
}

interface math{
    int operation(int a, int b);
}
