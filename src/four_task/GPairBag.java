package four_task;

import first_task.Pair;
import third_task.PairBag;

public class GPairBag<T1,T2> {
    private PairBag bag;
    public GPairBag(int size) {
        bag = new PairBag(size);
    }

    public void add_elem(Pair<T1,T2> pair) {
        bag.add_elem(pair);
    }

    public Pair<T1,T2> get_elem(int i){
        return (Pair<T1, T2>) bag.get_elem(i);
    }
}
