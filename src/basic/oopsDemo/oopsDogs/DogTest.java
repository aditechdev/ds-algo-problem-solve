package basic.oopsDemo.oopsDogs;

public class DogTest {
    public static void main(String[] args) {
        DogJAVA dj = new DogJAVA("Cody", 10);
        dj.introduce();
        dj.setAge(15);
        System.out.println(dj.getAge());



        DogJAVA d2 = new DogJAVA("Dobly");
        d2.introduce();
        System.out.println(DogJAVA.count);

    }
}
