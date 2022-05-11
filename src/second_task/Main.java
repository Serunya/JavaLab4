package second_task;

import first_task.Pair;
import third_task.PairBag;

public class Main {
    public static void main(String[] args) {
        Bag2 bag = new Bag2(5);
        bag.add_elem("24");
        bag.add_elem(11);
        bag.add_elem(new Pair<>(1,5));
        System.out.println(bag.get_elem(1));
        PairBag b = new PairBag(5);

    }
}
