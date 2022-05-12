package six_task;

import fife_task.GenericPairBag;
import first_task.Pair;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    GenericPairBag<String,String> bag = new GenericPairBag<>();
    String[] list;
    Main(int n){
        if((n > 0) && ((n & (n - 1)) == 0)){
            list = new String[n];
        }
        else {
            System.out.println("Неверно введено кол-во комманд - автоматически установленно 4");
            list = new String[4];
        }
    }
    public void add_command(String name_command){
        Random rand = new Random();
        while (true) {
            int pos = rand.nextInt(0, list.length);
            if (list[pos] == null) {
                list[pos] = name_command;
                break;
            }
        }
    }

    public void create_pair_command(){
        for(int i = 0; i < list.length;i+=2){
            bag.add_element(new Pair<>(list[i],list[i+1]));
        }
    }

    public Pair get_pair(int pos){
        return bag.get_element(pos);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать на турнир.");
        System.out.print("Введите количество комманд: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Main bag = new Main(n);
        n = bag.list.length;
        for(int i = 0; i < n; i++) {
            System.out.print("Введите название команды " + i + ": ");
            String name = scanner.nextLine();
            bag.add_command(name);
        }
        while(n > 1) {
            bag.create_pair_command();
            n = n / 2;
            Main temp = new Main(n);
            for (int i = 0; i < n; i++) {
                Pair<String, String> pair = bag.get_pair(i);
                System.out.println("Соревнуются комманды 1: " + pair.getFirst() + " И 2: " + pair.getSecond());
                System.out.println("Выберите кто победил: ");
                int winner = scanner.nextInt();
                if(winner == 1){
                    temp.add_command(pair.getFirst());
                }
                if(winner == 2){
                    temp.add_command(pair.getSecond());
                }
            }
            bag = temp;
        }
        System.out.println("Победила команда: " + bag.list[0]);
    }
}
