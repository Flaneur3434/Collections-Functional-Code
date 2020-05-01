package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static streams.Gender.FEMALE;
import static streams.Gender.MALE;

public class Main {
    public static void main(String args[]){
        List<Person> people = getPeople();

        //Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);

        //Sorted (puts it in order like the collections sort method)
        List<Person> ageSorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        ageSorted.forEach(System.out::println);

        //All Match (All of the elements must comply)
        boolean AllMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);

        System.out.println(AllMatch);

        //Any Match (At least one has to comply)
        boolean AnyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 84);

        System.out.println(AnyMatch);

        //None Match (None of the elements has to comply)
        boolean NoneMatch = people.stream()
                .noneMatch(person -> person.getAge() == 55);

        System.out.println(NoneMatch);

        //Max (Finds the max value)
        //The variable needs to be an Optional because it could return a null value
        Optional<Person> maxValue = people.stream()
                .max(Comparator.comparing(Person::getAge));

        System.out.println(maxValue);

        //or if you dont want to use Optional...
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Min (Finds the min value)
        //The variable needs to be an Optional because it could return a null value
        Optional<Person> minValue = people.stream()
                .min(Comparator.comparing(Person::getAge));

        System.out.println(maxValue);

        //or if you dont want to use Optional...
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        //Group
        Map<Gender, List<Person>> groupBy = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupBy.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        //You want to find the oldest female and print the name
        people.stream()
                .filter(person -> person.getGender().equals(FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
    }


    private static List<Person> getPeople(){
        return List.of(
            new Person("Kendall Carmel", 23, MALE),
            new Person("Jason Borne", 45, MALE),
            new Person("McKenzy Martin", 67, FEMALE),
            new Person("Arty Jr", 85, FEMALE),
            new Person("Uganda Knucks", 32, MALE),
            new Person("Bob Joe", 63, MALE)
        );
    }

}
