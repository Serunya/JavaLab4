package second_task;

import first_task.Pair;

public class Bag {
    place<Object> last_elem;
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.append("Привет мир");
        bag.append(12.);
        bag.append(45);
        bag.append(new Pair("Мир труд май",5));
        bag.input();
    }

    void input(){
        place temp = last_elem;
        while(temp != null){
            System.out.println(temp.object);
            temp = temp.prev;
        }
    }

    void append(Object object){
        place temp = new place<>(object);
        temp.set_prev(last_elem);
        last_elem = temp;
    }


    private class place<type>{
        place prev = null;
        type object;
        place(type object){
            this.object = object;
        }
        void set_prev(place elem){
            this.prev = elem;
        }
    }
}
