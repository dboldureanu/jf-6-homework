package md.tekwill.jf6.homework.ex7;

import java.util.ArrayList;
import java.util.List;

// Uncomment the code then implement the missing parts.
public class Cart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    /* Sum up all items prices */
    public double getTotalPrice() {
        double total = 0.0;
        for (Item item: items) {
            total += item.getPrice();
        }

        return total;
    }


}
