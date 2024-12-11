package shop;

import java.util.ArrayList;
import java.util.List;
import shop.products.Product;

public class GUI {
    private List<Product> Products = new ArrayList<Product>();

    public void AddProduct(Product prod) {
        Products.add(prod);
    }

    public void getProducts() {
        for (Product p : Products) {
            System.out.println(p.getName() + " " + p.getPrice());
        }
    }
}