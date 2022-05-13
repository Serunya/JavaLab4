package seven_task;

import java.util.ArrayList;

public class DList<T1,T2> {
    ArrayList<T1> first_list = new ArrayList<>();
    ArrayList<T2[]> second_list = new ArrayList<>();
    public void add(T1 first_value, T2[] second_value){
        first_list.add(first_value);
        second_list.add(second_value);
    }

    public void input_list(){
        for(int i = 0; i < first_list.size();i++){
            System.out.print("{ " + first_list.get(i) + " , {" );
            for (T2 v: second_list.get(i)){
                System.out.print(" " + v + " ");
            }
            System.out.println("} }");
        }
    }

    public T2[] remove(int pos){
        first_list.remove(pos);
        return second_list.remove(pos);
    }

    public T2[] remove(T1 first_value){
        int pos = first_list.indexOf(first_value);
        return second_list.remove(pos);
    }

    public T2[] get(int pos){
        return second_list.get(pos);
    }

    public T2[] get(T1 first_value){
        int pos = first_list.indexOf(first_value);
        return second_list.get(pos);
    }
}
