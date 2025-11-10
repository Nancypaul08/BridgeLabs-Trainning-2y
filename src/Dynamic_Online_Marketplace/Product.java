package Dynamic_Online_Marketplace;

class Product<T> {
    private String name;
    private double price;
    private T category; // This is the type-specific category

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void applyPrice(double newPrice) {
        this.price = newPrice;
    }

    public void showDetails() {
        System.out.println(name + " | Category: " + category + " | Price: ₹" + price);
    }
}
