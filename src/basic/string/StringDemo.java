package basic.string;

public class StringDemo {
    public static void main(String[] args) {
        String s  = "Hello";
        String greetings = "HelloHello";
        System.out.println(greetings);
        // Iterate over the 0 letter
        greetings.charAt(0);
        for (int i = 0; i < greetings.length(); i++) {
            System.out.println(greetings.charAt(i));
        }
        // Refering the same object
        String name = "Aditya";
        String myName = "Aditya";
        String myNameSHort = "aditya";
        System.out.println("Compare Name and myName " + (name == myName));
        System.out.println("Compare Name and myName using .equal " +(name.equals(myName)));

        System.out.println("Compare Name and myNameShort " + (name == myNameSHort));
        System.out.println("Compare Name and myNameShort using .equal " + (name.equals(myNameSHort)));
        // Two Different object in the memory
        String x = new String("Hi");
        String y = new String("Hi");
        System.out.println(x==y); // false: This is false because it is checking reference
        System.out.println(x.equals(y)); // true: This is checking the content

    }
}
