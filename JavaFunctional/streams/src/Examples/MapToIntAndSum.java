package Examples;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntAndSum {
    public static void main(String args[]){
        List<String> alist = new ArrayList<>();
        alist.add("Sam");
        alist.add("Jake");
        alist.add("Blake");
        alist.add("Kate");
        alist.add("Hannah");

        List<User> userList = alist.stream()
                .filter(name -> !name.equals("Sam"))
                .map(name -> {
                    return new User(name,45);
                })
                .collect(Collectors.toList());

        userList.stream()
                .forEach(System.out::println);

       int sum =  userList.stream()
                .mapToInt(user -> {
                    return user.getAge();
                }) // Always returns int
                .sum();

       System.out.println(sum);
    }
}

