package Examples;

import java.util.List;

class User{
    private final String name;
    private final int age;
    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name + " : " + age;
    }

}
