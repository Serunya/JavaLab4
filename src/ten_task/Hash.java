package ten_task;

import nine_task.HashFunction;

public class Hash extends HashFunction<Person> {
    Hash(int size){
        super(size);
    }
    @Override
    public int hash(Person s) {
        int hash_sum = 0;
        char[] second_name = s.getSecond_name().toCharArray();
        for(char i: second_name){
            hash_sum += (int)i;
        }
        return hash_sum % (super.size);
    }
}
