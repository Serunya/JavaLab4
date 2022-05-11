package four_task;

import first_task.Pair;

public class Main {
    public static void main(String[] args) {
        GPairBag<Integer,String> bag = new GPairBag<>(4);
        bag.add_elem(new Pair<>(5,"S"));
        //bag.add_elem(new Pair<>(1,2));-- выведет ошибку
        bag.add_elem(new Pair<>(241,"Дима"));
    }
}
