package seven_task;

import java.util.ArrayList;

public class DList<T1,T2> {
    ArrayList<T1> first_list = new ArrayList<>();
    ArrayList<ArrayList<T2[]>> second_list = new ArrayList<>();


    public void add(T1 first_value,ArrayList<T2[]> second_value) {
        for(T2[] i:second_value){
            add(first_value,i);
        }
    }

    public void add(T1 first_value,T2[] second_value){
        if(first_list.contains(first_value)){
            int pos = first_list.indexOf(first_value);
            second_list.get(pos).add(second_value);
        }
        else{
            first_list.add(first_value);
            second_list.add(new ArrayList<>());
            add(first_value,second_value);
        }
    }

    public String toString(){
        String return_str = "";
        for(int i = 0; i < first_list.size();i++){
            return_str += "" + first_list.get(i) + " : {";
            for (T2[] v: second_list.get(i)){
                return_str += " (";
                for(T2 j: v) {
                    return_str += " " + j + " ";
                }
                return_str += ") ";
            }
            return_str += "}\n";
        }
        return return_str;
    }
    /*
    public void add(T1 first_value, T2[] second_value){
        add(first_value,new ArrayList<>(Arrays.asList(second_value)));
    }

    public void add(T1 first_value, ArrayList<T2> second_value){
        if(first_list.contains(first_value)){
            int pos = first_list.indexOf(first_value);
            second_list.get(pos).add((T2[]) second_value.toArray());
        }
        else {
            first_list.add(first_value);
            second_list.add((ArrayList<T2[]>) second_value);
        }
    }


    public String toString(){
        String return_str = "";
        for(int i = 0; i < first_list.size();i++){
            return_str += "{ " + first_list.get(i) + " : {";
            for (T2[] v: second_list.get(i)){
                return_str += " " + v + " ";
            }
            return_str += "} }\n";
        }
        return return_str;
    }

    public ArrayList<T2> remove(int pos){
        first_list.remove(pos);
        return second_list.remove(pos);
    }

    public ArrayList<T2> remove(T1 first_value){
        int pos = first_list.indexOf(first_value);
        return second_list.remove(pos);
    }

    public ArrayList<T2> get(int pos){
        return second_list.get(pos);
    }

    public ArrayList<T2> get(T1 first_value){
        int pos = first_list.indexOf(first_value);
        return second_list.get(pos);
    }
     */
}
