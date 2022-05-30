package ten_task;

import nine_task.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<Person> table = new HashTable<>(new Hash(15));
        Person first_citizen = new Person("Имя", "Фамилия", 15,true);
        table.add(first_citizen);
        Person second_citizen = new Person("Сергей", "Кондратов", 19, true);
        table.add(second_citizen);
        Person find = table.find("Фамилия");
        System.out.println(find.input());
        find = table.find("Кондратов");
        System.out.println(find.input());
    }

}
