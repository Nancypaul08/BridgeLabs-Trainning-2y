package Dynamic_Online_Marketplace;

public class Main {
    public static void main(String[] args) {

        // Create products of different categories
        Product<BookCategory> book = new Product<>("Java Programming", 499, BookCategory.EDUCATION);
        Product<ClothingCategory> tshirt = new Product<>("Casual T-Shirt", 299, ClothingCategory.MEN);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15999, GadgetCategory.MOBILE);

        // Apply discounts
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(tshirt, 5);
        DiscountUtil.applyDiscount(phone, 15);

        // Catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(tshirt);
        catalog.addProduct(phone);

        // Display catalog
        catalog.displayCatalog();
    }
}

