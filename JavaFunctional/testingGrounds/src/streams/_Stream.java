package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String args[]){
        List<Person> people = List.of(
                new Person("Kendall", Gender.MALE),
                new Person("Marry", Gender.FEMALE),
                new Person("Lizzy", Gender.FEMALE),
                new Person("Bob", Gender.MALE),
                new Person("Joe", Gender.MALE)
        );

        //Java stream API
        people.stream()
                .map(person -> person.name)
                //Function<Person, String> personStringFunction = person -> person.name
                .mapToInt(name -> name.length())
                //ToIntFunction<String> length = String::length;
//                .collect(Collectors.toSet())
                .forEach(name -> System.out.println(name));
                //.forEach(System.out::println) <-- method reference

        // all of the .somethings are functions (Consumer type, Predicate type, Supplier type)

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
                //.allMatch is a Predicate type
                //.allMatch returns true if only Females are in the list

        boolean containsAnyFemales = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));
        //.anyMatch returns true if atlest one Female is in the list

        boolean doesNotContainFemales = people.stream()
                .noneMatch(person -> Gender.FEMALE.equals(person.gender));
        //.noneMatch returns true if there are no females

        System.out.println(containsOnlyFemales);
        System.out.println(containsAnyFemales);
        System.out.println(doesNotContainFemales);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "Person's name is: "
                    + name + " / " +
                    "Person's gender is: "
                    + gender;
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
