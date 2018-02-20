package md.tekwill.jf6.homework.ex7;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    public double getTotalPrice() {
        double total = 0;
        for (Item item: items) {
            total += item.price;
        }
        return total;
    }
}
