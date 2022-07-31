package basic.oopsDemo.oopsDogs;

public class DogJAVA {
   String name;
   int hunger;

   DogJAVA(){
      System.out.println("Making a dog");
   }
   DogJAVA(String name, int hunger){
      this(); // this will call the default constructor first
      // Use this.instance_variable to access the class variable(to clear the ambiguity)
      this.name = name;
     this.hunger = hunger;
      System.out.println("Initialising the dog");
   }

   void introduce(){
      System.out.println("I am a dog " + name);
   }


}
