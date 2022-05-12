package nine_task;

public abstract class HashFunction<K> {
    protected int size;
    protected HashFunction(int size) {
        this.size = size;
    }

    public abstract int hash(K s);
}
