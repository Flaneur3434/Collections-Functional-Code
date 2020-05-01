import java.util.function.Function;

public class _Function {
    public static void main(String ags[]){
        System.out.println(increment(0));
        System.out.println(incrementByOneFunction.apply(0));

        int increment1 = incrementByOneFunction.apply(4);
        System.out.println(multiplyBy10.apply(increment1));

        //can combine the above by doing:

        Function<Integer, Integer> combinationFunction =
                incrementByOneFunction.andThen(multiplyBy10);
        //Made a new function called combinationFunction which combine the previous functions
        //by using .andThen()
        System.out.println(combinationFunction.apply(10));

    }

    //Functional Style
    public static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    public static Function<Integer, Integer> multiplyBy10 = number -> number*10;
    //Function<Input Type, Return Type>

    public static int increment (int number){
        return number+1;
    }
}
