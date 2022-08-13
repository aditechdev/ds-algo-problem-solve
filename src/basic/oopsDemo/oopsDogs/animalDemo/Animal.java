package basic.oopsDemo.oopsDogs.animalDemo;

public class Animal {
    String name;
    boolean isHungry;

    Animal(){
        System.out.println("Animal Created");

    }
    Animal(String name, boolean isHungry){
        this();
        this.name = name;
        this.isHungry = isHungry;
        introduce();
    }
    void makeNoise(){
        System.out.println("Animal Noise not available");
    }

    void introduce(){
        System.out.println("I am a " + name);
    }
}
