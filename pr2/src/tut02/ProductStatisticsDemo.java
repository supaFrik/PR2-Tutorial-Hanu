package tut02;

public class ProductStatisticsDemo {

    public static void main(String[] args) {

        Product p1 = new Product("asus rog", 1000, 10, 50);
        Product p2 = new Product("asus tuff", 25, 5, 200);
        Product p3 = new Product("asus zex", 75, 0, 100);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        Product.displayStatistics();

        System.out.println("\n--- Updating quantity of Laptop ---");
        p1.updateQuantity(60);

        Product.displayStatistics();
    }
}
