package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterAndForEach {
    public static void main(String args[]){
        List<String> alist = new ArrayList<>();

        alist.add("Sam");
        alist.add("Jake");
        alist.add("Ryan");
        alist.add("Kate");
        alist.add("Bob");

        alist.stream()
                .filter(name -> name.equals("Sam"))
                .forEach(System.out::println);

        System.out.println();

        alist.stream()
                .filter(name -> !name.equals("Sam"))
                .forEach(System.out::println);
    }
}
