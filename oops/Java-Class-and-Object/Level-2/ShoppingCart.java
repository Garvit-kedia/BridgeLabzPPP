import java.util.ArrayList;

public class ShoppingCart {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double totalCost() {
            return price * quantity;
        }
    }

    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int quantity) {
        items.add(new CartItem(name, price, quantity));
        System.out.println("Added " + name);
    }

    void removeItem(String name) {
        items.removeIf(item -> item.itemName.equals(name));
        System.out.println("Removed " + name);
    }

    void displayTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.totalCost();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 50, 3);
        cart.addItem("Banana", 20, 5);
        cart.displayTotal();
        cart.removeItem("Apple");
        cart.displayTotal();
    }
}