package shop;

import shop.products.Shoe;
import shop.products.Hat;
import shop.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Shoe shoe1 = new Shoe("Running Shoe", 44, 37);
        Shoe shoe2 = new Shoe("Formal Shoe", 400, 38);
        Hat hat1 = new Hat("Baseball Cap", 240, 48);
        Hat hat2 = new Hat("Winter Hat", 420, 44);

        products.add(shoe1);
        products.add(shoe2);
        products.add(hat1);
        products.add(hat2);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}