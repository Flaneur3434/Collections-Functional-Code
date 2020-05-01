package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String ags[]){
        System.out.println
                (increment(0));

                                                System.out.println();

        System.out.println
                ("//Function ");

        System.out.println
                (incrementByOneFunction.apply(0));

                                                System.out.println();

        System.out.println
                ("//Function (Before the .andThen())");

        int increment1 = incrementByOneFunction.apply(4);
        System.out.println
                (multiplyBy10.apply(increment1));

        //can combine the above by doing:

                                                System.out.println();

        System.out.println
                ("//Function (.andThen())");

        Function<Integer, Integer> combinationFunction =
                incrementByOneFunction.andThen(multiplyBy10);
        //Made a new function called combinationFunction which combine the previous functions
        //by using .andThen()
        System.out.println
                (combinationFunction.apply(10));

                                                System.out.println();

        System.out.println("//BiFunction");
        System.out.println
                (incrementByOneThenMultiply.apply(3,6));

    }

    //Functional Style
    private static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    private static Function<Integer, Integer> multiplyBy10 = number -> number*10;
    //Function<Input Type, Return Type>

    //A Bifunction takes in 2 input and returns one output
    private static BiFunction<Integer, Integer, Integer> incrementByOneThenMultiply =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1)*numberToMultiplyBy;
    //BiFunction<Input1 Type, Input2 Type, Return Type>


    private static int increment (int number){
        return number+1;
    }

    private static int IBOTM (int number, int numToMultiplyBy){
        return((number+1) * numToMultiplyBy);
    }
}
