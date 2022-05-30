package eight_task;

import seven_task.DList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OptimalSolution {

    private static boolean Contains(int a, Integer[] arr){
        for(int i: arr)
            if(i == a)
                return true;
        return false;
    }

    public static Integer[] concatenate(Integer[] a, Integer[] b) {
        int aLen = a.length;
        int bLen = b.length;
        Integer[] c = (Integer[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);

        return c;
    }

    public static Integer[] bubble_sort(Integer[] array){
        boolean Flag = false;
        while (!Flag) {
            Flag = true;
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length * 0.25; j++) {
                    int pos = j;
                    int min = array[j];
                    for(int q = j + 1; q < array.length; q++){
                        if(array[q] < min){
                            pos = q;
                            min = array[q];
                        }
                    }
                    array[pos] = array[j];
                    array[j] = min;
                }
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    Flag = false;
                }
            }
        }
        return array;
    }

    private static boolean equals(ArrayList<Integer[]> array1, Integer[] array2){
        for(Integer[] array: array1){
            if(Arrays.equals(array,array2))
                return true;
        }
        return false;
    }

    public static DList Solution(int sum, Integer[] money){
        DList<String, Integer> res = new DList<>();
        // Сортировка пузырь крутой такой(обычный)АА
        money = bubble_sort(money);
        for(Integer i = 0; i <= sum;i++){
            if(Contains(i, money)){
                res.add(Integer.toString(i),new Integer[]{i});
                continue;
            }
            for(int j : money){
                for(int m = res.getFirst_list().size()-1;m >= 0;m--){
                    if(j + Integer.parseInt(res.getFirst_list().get(m)) == i){
                        for(Integer[] k: res.get(res.getFirst_list().get(m))) {
                            Integer[] temp = bubble_sort(concatenate(k, new Integer[]{j}));
                            if(res.get(Integer.toString(i)) != null) {
                                if (temp.length < res.get(Integer.toString(i)).get(0).length) {
                                    res.remove(Integer.toString(i));
                                    res.add(Integer.toString(i), temp);
                                }
                                if (temp.length == res.get(Integer.toString(i)).get(0).length) {
                                    if(!equals(res.get(Integer.toString(i)),temp))
                                        res.add(Integer.toString(i), temp);
                                }
                            }
                            else{
                                res.add(Integer.toString(i), temp);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Solution(1000000,new Integer[]{1,2,5,10,50,100,500,1000,2000,5000}));
    }
}
