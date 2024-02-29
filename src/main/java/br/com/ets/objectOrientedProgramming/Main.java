package br.com.ets.objectOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        //class and instance
        Product product = new Product();

        product.name = "Laptop";
        product.discount = 0.10;
        product.price = 5000;

        System.out.println(product.name);

        Product product1 = new Product("Shampoo");
        System.out.println((product1.name));

        Product product2 = new Product("Coffee", 20);
        System.out.println((product2.name));
        System.out.println((product2.price));

        Product product3 = new Product("Computer", 1000, 0.5);
        System.out.println((product3.name));
        System.out.println((product3.price));
        System.out.println((product3.discount));
    }
}
