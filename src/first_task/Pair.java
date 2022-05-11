package first_task;

public class Pair<type_first,type_second> {
    private type_first first;
    private type_second second;

    public Pair(type_first first, type_second second){
        this.first = first;
        this.second = second;
    }
    public void setFirst(type_first first) {
        this.first = first;
    }
    public void setSecond(type_second second) {
        this.second = second;
    }
    public type_first getFirst() {
        return first;
    }
    public type_second getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {

    }

}
