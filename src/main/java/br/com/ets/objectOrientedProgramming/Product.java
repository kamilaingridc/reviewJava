package br.com.ets.objectOrientedProgramming;

// Pascal Case
public class Product {
    String name;
    double price;
    double discount;

    Product(){
        System.out.println("Construtor sem parâmetro");
    }

    Product(String name){
        System.out.println("Construtor de 1 parâmetro");
        this.name = name;
    }

    Product(String name, double price){
        System.out.println("Construtor de 2 parâmetros");
        this.name = name;
        this.price = price;
    }

    Product(String name, double price, double discount){
        System.out.println("Construtor de 3 parâmetros");
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    //camelCase
    double calculatePriceWithDiscount(){
        return price - (price*discount);
    }

    // sobrecarga
    double calculatePriceWithDiscount(double aditionalDiscount){
        return price - (price*(discount + aditionalDiscount));
    }

    // %d - tipos inteiros - byte, short, int e long
    // %f - tipos reais - float e double
    // %c - tipos caractere - char
    // %b - tipo lógico - boolean
    // %s - string


    String returnProductsInformations(){
        return String.format("O produto %s está com o preço de R$%.1f e com o desconto de %.2f e o preço final fica em R$%.2f.", this.name, this.price, this.discount, calculatePriceWithDiscount());
    }

    void printName(){
        System.out.println(name);
    }
}
