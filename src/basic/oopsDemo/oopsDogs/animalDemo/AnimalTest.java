package basic.oopsDemo.oopsDogs.animalDemo;

public class AnimalTest {
    public static void main(String[] args) {
        Lion l1 = new Lion("Simba", false);
        System.out.println(l1.name);
        l1.makeNoise();
    }
}
