package second_task;

import first_task.Pair;
import java.util.Random;

public class  Bag2 {
    protected Object[] bag;
    public final int size;


    protected Bag2(int size){
        bag = new Object[size];
        this.size = size;
    }

    public Object get_elem(int pos){
        return bag[pos];
    }

    public final Object remove(int pos){
        Object temp = bag[pos];
        bag[pos] = null;
        return temp;
    }

    public int get_count_elem(){
        int count = 0;
        for(Object v: bag){
            if(v != null){
                count++;
            }
        }
        return count;
    }

    protected void add_elem(Object object){
        Random rand = new Random();
        int pos = (int)Math.round(Math.random()*(size-1));
        if(bag[pos] == null){
            bag[pos] = object;
        }
        else {
            for(Object v:bag){
                if(v == null){
                    v = object;
                }
            }
        }
    }
}
