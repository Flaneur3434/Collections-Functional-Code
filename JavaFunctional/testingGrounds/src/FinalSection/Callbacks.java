package FinalSection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("John", "Montana", value -> {
            System.out.println("no last name provided by "  + value);
        });

        System.out.println();

        hello("Kendall", null, value -> {
            System.out.println("no last name provided by "  + value);
        });
    }

    //Callbacks
    private static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.accept(firstName);
        }
    }
}
