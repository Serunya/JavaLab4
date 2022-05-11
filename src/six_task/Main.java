package six_task;

import first_task.Pair;
import four_task.GPairBag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Command[] bag;
    int n; // Кол-во комманд
    int index = 0;
    Main(int n){
        if(n %2 == 0 && n > 0)
            this.n = n;
        else
            this.n = 8;
        this.bag = new Command[this.n];
    }

    public void add_command(Command command){
        Random rand = new Random();
        int pos = (int)Math.round(Math.random()*(n-1));
        if(bag[pos] == null){
            bag[pos] = command;
        }
        else {
            for(Object v:bag){
                if(v == null){
                    v = command;
                }
            }
        }
    }

    public void setN(int n) {
        this.n = n;
        bag = new Command[n];
    }

    private Pair<Command,Command> get_command(){
        Pair pair = new Pair<>(bag[index],bag[++index]);
        index++;
        if(index == n){
            index = 0;
        }
        return pair;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать на турнир.");
        System.out.println("Введите количество комманд: ");
        int n = scanner.nextInt();
        System.in.skip(2);
        Main bag = new Main(n);
        for(int i = 0; i < n; i++){
            System.out.println("Введите название команды " + i + ": ");
            String name = scanner.nextLine();
            bag.add_command(new Command(name));
        }
        for(int k = 0; k < n/2;k++) {
            Main temp = new Main(bag.n/2);
            for (int i = 0; i < n; i += 2) {
                Pair pair = bag.get_command();
                System.out.println("Соревнуются комманды 1: " + pair.getFirst().toString() + " И 2: " + pair.getSecond().toString());
                System.out.println("Выберите кто победил: ");
                int winner = scanner.nextInt();
                switch (winner){
                    case 1:
                        temp.add_command((Command) pair.getFirst());
                        break;
                    case 2:
                        temp.add_command((Command) pair.getSecond());
                        break;
                    default:
                        System.out.println("Ну всё типо ошибка - конец проги");
                        return;
                }
            }
            bag = temp;
        }

    }


    private static class Command{
        public String name;
        Command(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
