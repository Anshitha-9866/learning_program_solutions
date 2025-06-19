import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}

public class ECommerceSearch {

    // Linear Search by product name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by product name
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Mouse", "Accessories"),
            new Product(104, "Keyboard", "Accessories"),
            new Product(105, "Charger", "Electronics")
        };

        // Linear Search
        String target = "Mouse";
        Product result = linearSearch(products, target);
        System.out.println("Linear Search Result: " + (result != null ? result : "Not Found"));

        // Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName)); // Sort by name
        Product result2 = binarySearch(products, target);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
