package basic.oopsDemo.oopsDogs.animalDemo;

public class Lion extends Animal{

    Lion(String name, boolean isHungry) {
        super(name, isHungry);
    }
    void makeNoise(){
        System.out.println("Gurrrrrr");
    }
}
