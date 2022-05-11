package third_task;

import first_task.Pair;
import second_task.Bag2;

public class Main {
    public static void main(String[] args) {
        PairBag bag = new PairBag(5);
        bag.add_elem(new Pair(5,"Мир"));
        bag.add_elem(new Pair(5.,"Олег"));
        for(int i = 0; i < bag.size;i++){
            System.out.println(bag.get_elem(i));
        }
    }
}
