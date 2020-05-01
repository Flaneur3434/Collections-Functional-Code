package streams;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Gender getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return name + " : " + age + " : " + gender;
    }
    //You need this or the System.out.println() gets messed up
}
