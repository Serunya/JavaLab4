package fife_task;

import first_task.Pair;

import java.util.ArrayList;

public class GenericPairBag<T1,T2>{
    ArrayList<Pair<T1,T2>> list = new ArrayList<>();

    public void add_element(Pair<T1,T2> element){
        list.add(element);
    }

    public Pair<T1, T2> get_element(int pos){
        return list.get(pos);
    }
}
