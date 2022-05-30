package ten_task;

import nine_task.HashValue;

import java.util.Objects;

public class Person implements HashValue<String> {
    String first_name;
    String second_name;
    int age;
    boolean male;

    public Person(String first_name, String second_name, int age, boolean male) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.age = age;
        this.male = male;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String input() {
        return "Моё имя: " + first_name + "\nМне " + age + " лет.";
    }

    @Override
    public String toString() {
        return second_name;
    }

    @Override
    public boolean contains(String value){
        return second_name.equals(value);
    }
}
