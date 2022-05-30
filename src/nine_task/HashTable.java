package nine_task;

import java.util.ArrayList;

public class HashTable<T extends HashValue> {
    ArrayList<ArrayList<T>> table;
    HashFunction hash;
    public HashTable(HashFunction hash){
        this.hash = hash;
        table = new ArrayList<>(hash.size);
        for (int i = 0; i < hash.size; i++) table.add(new ArrayList<>());
    }

    public T find(Object value){
        int hash_sum = hash.hash(value);
        ArrayList<T> table_value = table.get(hash_sum);
        if(table_value.isEmpty()){
            return null;
        }
        if(table_value.size() == 1){
            return table_value.get(0);
        }
        else{
            for(T v:table_value){
                if(v.contains(value)){
                    return v;
                }
            }
        }
        return null;
    }

    public void add(T value){
        int hash_sum = hash.hash(value.toString());
        table.get(hash_sum).add(value);
    }

}
