package functionalInterface;

import java.util.Optional;

public class _Optional {
    //Optional Class is a container object used to contain not null objects
    //Optional Class has various utility methods to facilitate code to handle values as
    //available or not available instead of checking null values
    public static void main(String args[]){
        //Optional.of is used when you know that the value is not null
        //Optional.ofNullable is used when you dont know if the value will be present
        Optional<String> empty = Optional.empty();
        System.out.println(empty); //Optional.empty
        System.out.println(empty.isPresent()); //false
        System.out.println(empty.isEmpty()); //true

        Optional<String> empty2 = Optional.of("hello");
        System.out.println(empty2.isPresent()); //ture
        System.out.println(empty2.isEmpty()); //false

        Optional<String> notEmpty = Optional.of("hello");
        String orElse = notEmpty
                .map(String::toUpperCase) //Can chain them up
                .orElse("world");
        System.out.println(orElse); //prints hello because notEmpty is not Empty

        String orElse2 = empty.orElse("This is empty");
        System.out.println(orElse2);//prints This is empty because it is empty

        Optional<String> _JustAString = Optional.ofNullable(null);
        String chaining = _JustAString
                .map(String::toUpperCase)
                .orElseGet(() -> { //This is a supplier function
                    //Can add extra code
                    //.orElseGet runs the same logic as .orElse
                    String answer = "This Optional class is empty";
                    return answer;
                    //You need a return type
                });
        System.out.println(chaining);

        /////////////////////////////Functional Programming Section////////////////////////////////
        Object value = Optional.ofNullable(null)
                .orElseGet(() ->{ //Supplier
                    String defualtValue = "default value";
                    return defualtValue;
                });

        Optional.ofNullable("kendallcarmel@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Send email to " + email),
                        () ->{
                            System.out.println("Could not sent email");
                        }
                );

        System.out.println(value);
    }
}
