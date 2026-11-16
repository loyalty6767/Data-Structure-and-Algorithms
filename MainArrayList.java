import java.util.ArrayList;

abstract class AbstractClassArrayList {

    protected ArrayList<String> fruit;

    public abstract void addItem(String item);

    public abstract void removeItem(String item);

    public abstract void displayList();

    public abstract void displayElement(int index);
}

class SubClassArrayList extends AbstractClassArrayList {

    public SubClassArrayList() {
        fruit = new ArrayList<>();
    }

    @Override
    public void addItem(String item) {
        fruit.add(item);
    }

    @Override
    public void removeItem(String item) {
        fruit.remove(item);
    }

    @Override
    public void displayList() {
        System.out.println("ArrayList Value:");

        for (String fruits : fruit) {
            System.out.println(fruits);
        }
    }

    @Override
    public void displayElement(int index) {
        System.out.println("Element at index " + index + ": " + fruit.get(index));
    }
}

public class MainArrayList {

    public static void main(String[] args) {

        SubClassArrayList list = new SubClassArrayList();

        list.addItem("Apple");
        list.addItem("Banana");
        list.addItem("Cherry");

        list.displayList();

        list.removeItem("Banana");

        list.displayElement(1);

        list.displayList();
    }
}
