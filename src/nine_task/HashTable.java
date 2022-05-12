package nine_task;

import java.util.ArrayList;

public class HashTable<T extends HashValue> {
    ArrayList<T> table;
    HashFunction hash;
    public HashTable(HashFunction hash){
        this.hash = hash;
        table = new ArrayList<>(hash.size);
        for (int i = 0; i < hash.size; i++) table.add(null);
    }

    public T get(int hash_sum){
        return table.get(hash_sum);
    }

    public T find(Object value){
        T find_element = null;
        for(T v: table){
            if(v != null){
                if(v.contains(value)){
                    find_element = v;
                }
            }
        }
        return find_element;
    }

    public void add(T value){
        table.set(hash.hash(value), value);
    }

}
