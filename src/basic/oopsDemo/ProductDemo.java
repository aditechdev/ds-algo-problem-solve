package basic.oopsDemo;

// A java file can have one or more classes
public class ProductDemo {
    //    try to demonstrate a product
    public static void main(String[] args) {
        Product p1 = new Product();
        // Setting the properties of class
        p1.name = "Camera1x100";
        p1.price = 1200;
        p1.seller = "AKA Electronics";
//        System.out.println(p1.name);
//        System.out.println(p1.price);
//        System.out.println(p1.seller);

        p1.print();
        Dog d1 = new Dog();
        d1.name = " Scooby";
        d1.breed = "Rotwiller";
        d1.Size = 10;
        d1.bark();
    }

}

class Dog{
    String breed;
    int Size;
    String name;

    void bark(){
        System.out.println("Woof Woof");
    }
}

class Product{
    String name;
    int price;
    String seller;
    void print(){
        System.out.println("Name: " + name);
        System.out.println("Price: "+ price);
        System.out.println("seller: "+ seller);
    }

}