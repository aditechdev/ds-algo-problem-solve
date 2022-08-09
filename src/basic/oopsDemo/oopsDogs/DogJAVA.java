package basic.oopsDemo.oopsDogs;

public class DogJAVA {
   String name;
   int hunger;
   static  int count; // Static variable can be get from anywhere
   // We use class name to access the static variable not the name

   private int age;

   DogJAVA(){
      System.out.println("Making a dog");
      count++;
   }
   DogJAVA(String name){
      this();
      this.name = name;
      System.out.println("Naming the Dog");

   }
   DogJAVA(String name, int hunger){
      this(); // this will call the default constructor first
      // Use this.instance_variable to access the class variable(to clear the ambiguity)
      this.name = name;
     this.hunger = hunger;

      System.out.println("Initialising the dog");
   }
   // Static method will work with other static methods/variable
   // It will give an error with static method / variables.
   static int getCount(){
      return count;
   }
   int getAge(){
      return  age;
   }
   void setAge(int age){
      if (age < 0){
         this.age = 5;
      }else{
         this.age = age;
      }
   }

   void introduce(){
      System.out.println("I am a dog " + name);
   }


}
