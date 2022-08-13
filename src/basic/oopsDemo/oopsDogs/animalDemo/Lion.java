package basic.oopsDemo.oopsDogs.animalDemo;

public class Lion extends Animal{

    Lion(String name, boolean isHungry) {
        super(name, isHungry); // super keyword call the parent class
    }
    void makeNoise(){
        if (isHungry) {
            System.out.println("Gurrrrrr...");

        }else{
            System.out.println("I am happy");
        }

    }
}
