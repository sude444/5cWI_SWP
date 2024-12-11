package shop.products;

public class Shoe extends Product {
    private int size;

    public Shoe(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}