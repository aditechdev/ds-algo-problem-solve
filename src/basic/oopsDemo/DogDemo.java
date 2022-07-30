package basic.oopsDemo;

public class DogDemo {
    public static void main(String[] args) {
        // Test your real class
        // launch your application
        Dog d1 = new Dog("Rotwiller", 20, "Bruto"); // 2nd Constructor
        d1.print();
        d1.bark();
        Dog d2 = new Dog(); // 1st Constructor
        d2.bark();
        Dog d3 = new Dog(); // 1st Constructor
        d3.print();

//        d1.name = " Scooby";
//        d1.breed = "Rotwiller";
//        d1.Size = 10;
//        d1.bark();

    }
}

class Dog{
    String breed;
    int age;
    String name;
    //  Special Function: Constructor of the class
    // This will call automatically when object is created
    // Constructor name will be same as class name
    // It doesn't have return type
    // I is called only one for each object
    // There could be multiple constructor
    Dog(){
        System.out.println("Creating a dog object");
    }

    // Parametrize Constructor
    Dog(String breed, int age, String name){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    void bark(){
        System.out.println("Woof Woof");
    }
    void print(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
    }
}
