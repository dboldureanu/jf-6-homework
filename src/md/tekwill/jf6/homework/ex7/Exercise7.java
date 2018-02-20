package md.tekwill.jf6.homework.ex7;

public class Exercise7 {

    // Uncomment the code then implement the missing parts.
    // You will need to implement a new class Item, containing fields name and price



    public static void main(String[] args) {
        Cart cart = new Cart();

        Item milk = new Item();
        milk.name = "Milk, 3.5%";
        milk.price = 22.5;
        cart.addItem(milk);

        Item bread = new Item();
        bread.name = "Oraseneasca, 400g";
        bread.price = 5.0;
        cart.addItem(bread);

        System.out.println("Total: " + cart.getTotalPrice());
    }
}
