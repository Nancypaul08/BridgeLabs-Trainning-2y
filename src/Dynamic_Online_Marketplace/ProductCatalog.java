package Dynamic_Online_Marketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private List<Product<?>> catalog = new ArrayList<>();

    public void addProduct(Product<?> product) {
        catalog.add(product);
    }

    public void displayCatalog() {
        System.out.println("\nProduct Catalog:");
        for (Product<?> p : catalog) {
            p.showDetails();
        }
    }
}

