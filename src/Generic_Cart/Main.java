package Generic_Cart;

public class Main {
    public static void main(String[] args) {

        // Cart for only Electronics
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Smartphone"));
        electronicsCart.addItem(new Electronics("Laptop"));
        System.out.println("Electronics Cart:");
        electronicsCart.displayItems();

        // Cart for only Clothing
        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));
        System.out.println("\nClothing Cart:");
        clothingCart.displayItems();

        // Uncomment below to see type safety in action
        // electronicsCart.addItem(new Clothing("Shirt"));  // ERROR: Not allowed
    }
}
