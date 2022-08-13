package basic.oopsDemo.oopsDogs.animalDemo;

public class AnimalTest {
    public static void main(String[] args) {
        Lion l1 = new Lion("Simba", false);
        System.out.println(l1.name);
        /*
            the output for make noise is Gurrr
            as it call the child method not the parent method
            this is due to compile time Polymorphism
            Animal{
            makeNoise(){}
            }
            Lion extends Animal{
            makeNoise(){}
            }

            first it will check in child class, if function is not present in child it will give animal


         */
        l1.makeNoise();
        Dogeee d1 = new Dogeee("Hubuuu", false);
//        d1.introduce();
        d1.makeNoise();

    }
}
