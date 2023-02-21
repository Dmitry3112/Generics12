import java.util.Random;

public class MagicBox<T> {

    private T[] items;
    private int volue;

    public MagicBox(int volue) {
        this.volue = volue;
        this.items = (T[]) new Object[volue];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int elements = 0;
        for (T e:items) {
            if (e == null){
                elements++;
            }}
        if (elements!=0)
            throw new RuntimeException("The box is not filled, it remains to fill %d elements!".formatted(elements));
        return items[random()];
    }

    private int random() {
        Random random = new Random();
        int randomInt = random.nextInt(volue);
        return randomInt;
    }

    public void show() {
        for (T e:items) {
            System.out.println(e);
        }
    }
}