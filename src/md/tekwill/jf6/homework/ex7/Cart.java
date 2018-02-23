package md.tekwill.jf6.homework.ex7;

import java.util.ArrayList;
import java.util.List;
import md.tekwill.jf6.homework.ex7.Item;

// Uncomment the code then implement the missing parts.
public class Cart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    /* Sum up all items prices */
    double total;
    public double getTotalPrice() {
        for (Item item: items) {
          total+=Item.getPrice(item.price);
        }

        return total;
    }
}
