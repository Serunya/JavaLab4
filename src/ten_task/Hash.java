package ten_task;

import nine_task.HashFunction;

public class Hash extends HashFunction<String> {
    Hash(int size){
        super(size);
    }
    @Override
    public int hash(String s) {
        int hash_sum = 0;
        for(char i: s.toCharArray()){
            hash_sum += (int)i;
        }
        return hash_sum % (super.size);
    }
}
