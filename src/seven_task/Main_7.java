package seven_task;

public class Main_7 {
    public static void main(String[] args) {
        DList<String,Integer> list = new DList();
        list.add("1", new Integer[]{1, 2});
        list.add("2", new Integer[]{2,5,1});
        list.add("Дима", new Integer[]{18,19,20,21});
        System.out.println(list.get(0));
        System.out.println(list.get("2"));
        for(Integer v: list.get("Дима")) System.out.print(v + " ");
    }
}
