package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main(String args[]){
        List<String> alist = new ArrayList<>();
        alist.add("Sam");
        alist.add("Jake");
        alist.add("Blake");
        alist.add("Kate");
        alist.add("Hannah");

        alist.stream()
                .filter(name -> name.equals("Sam"))
                .map(name -> {
                    return new User(name, 30);
                })//Takes an input and outputs something (Function Interface)
                .forEach(System.out::println);

        System.out.println();

        List<User> names = alist.stream()
                .filter(name -> !name.equals("Sam"))
                .map(name -> {
                    return new User(name, 45);
                })
                .collect(Collectors.toList());
                //doesn't return anything, a termianl operation
                //After a terminal operation, the stream stops
        names.stream()
                .forEach(System.out::println);

    }
}

