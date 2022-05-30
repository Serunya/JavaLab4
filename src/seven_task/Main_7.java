package seven_task;

import java.util.ArrayList;

public class Main_7 {

    public static void main(String[] args) {
        DList<String,Integer> list = new DList();
        list.add("1", new Integer[]{1,2});
        list.add("2",new Integer[]{2,3});
        list.add("1",new Integer[]{3,5});
        list.add("12",new Integer[]{42});
        System.out.println(list);
    }
}
