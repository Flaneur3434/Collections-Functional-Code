import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String ags[]){
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Bob", Gender.MALE),
                new Person("Kye", Gender.FEMALE),
                new Person("Marry", Gender.MALE)
        );

        System.out.println("Imperative approach: ");
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }

        System.out.println();

        System.out.println("Declarative approach: ");
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect((Collectors.toList()))
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "name="+ name + " / " +
                    " gender=" + gender +
                    "}";
        }
    }



    enum Gender{
        MALE, FEMALE
    }
}
