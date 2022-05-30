package seven_task;

import java.util.ArrayList;
import java.util.Set;

public class DList<T1,T2> {
    ArrayList<T1> first_list = new ArrayList<>();
    ArrayList<ArrayList<T2[]>> second_list = new ArrayList<>();


    public void add(T1 first_value, ArrayList<T2[]> second_value) {
        for (T2[] i : second_value) {
            add(first_value, i);
        }
    }

    public ArrayList<T1> getFirst_list() {
        return first_list;
    }

    public void add(T1 first_value, T2[] second_value) {
        if (first_list.contains(first_value)) {
            int pos = first_list.indexOf(first_value);
            second_list.get(pos).add(second_value);
        } else {
            first_list.add(first_value);
            second_list.add(new ArrayList<>());
            add(first_value, second_value);
        }
    }
    public void remove(T1 first_value){
        int pos = first_list.indexOf(first_value);
        first_list.remove(pos);
        second_list.remove(second_list.get(pos));
    }

    public String toString() {
        String return_str = "";
        for (int i = 0; i < first_list.size(); i++) {
            return_str += "" + first_list.get(i) + " : {";
            for (T2[] v : second_list.get(i)) {
                return_str += " (";
                for (T2 j : v) {
                    return_str += " " + j + " ";
                }
                return_str += ") ";
            }
            return_str += "}\n";
        }
        return return_str;
    }

    public ArrayList<T2[]> get(T1 first_value) {
        int pos = first_list.indexOf(first_value);
        if(pos == -1)
            return null;
        return (ArrayList<T2[]>) second_list.get(pos);
    }

    public ArrayList<T2[]> get(int pos) {
        return (ArrayList<T2[]>) second_list.get(pos);
    }
}