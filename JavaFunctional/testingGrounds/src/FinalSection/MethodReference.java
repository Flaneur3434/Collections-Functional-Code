package FinalSection;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    public static void main(String args[]){
        //The lambda expression is treated as a runnable method by the thread
        //The lambda expression takes in no arguments
        Thread t = new Thread(() -> printMessage());
        t.start();

        //when the lambda expression has no input arguments
        //and the method also doesn't take in any arguments you cna use
        //Method References
        Thread t2 = new Thread(MethodReference::printMessage);
        //Class Name::Method Name
        t2.start();

    }

    private static void printMessage(){
        System.out.println("Hello");
    }
}
