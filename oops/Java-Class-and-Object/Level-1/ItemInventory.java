import java.util.Scanner;

public class ItemInventory {
    static class Item {
        String itemCode;
        String itemName;
        double price;

        Item(String itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        void display() {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
        }

        double totalCost(int quantity) {
            return price * quantity;
        }
    }

    public static void main(String[] args) {
        Item item = new Item("A101", "Laptop", 75000);
        item.display();
        int quantity = 2;
        System.out.println("Total Cost for quantity " + quantity + ": " + item.totalCost(quantity));
    }
}