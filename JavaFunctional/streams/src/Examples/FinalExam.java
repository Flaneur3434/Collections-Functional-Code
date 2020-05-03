package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FinalExam {
    public static void main(String args[]){
        List<User2> alist = new ArrayList<>();
        alist.add(new User2("Peter", 20, "707-321-4098"));
        alist.add(new User2("Bob",  31, "707-893-4098"));
        alist.add(new User2("Jake", 45, "609-321-4098"));
        alist.add(new User2("Alice", 16, "707-321-7890"));
        alist.add(new User2("Kate", 7, "690-690-4545"));

        List<String> phoneNumbers = alist.stream()
                .map(user ->  user.getPhoneNumber())
                .filter(phoneNumber -> !phoneNumber.startsWith("707"))
                .collect(Collectors.toList());

        phoneNumbers.stream()
                .forEach(System.out::println);
    }
}

class User2{
    private final String name;
    private final int age;
    private final String phoneNumber;
    User2(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    @Override
    public String toString(){
        return name + " : " + age + " : " + phoneNumber;
    }

}
