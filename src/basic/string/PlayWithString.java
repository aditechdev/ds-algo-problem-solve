package basic.string;

public class PlayWithString {
    /**
     * Used while loop to find the index of word from the sentence.
     * <code>
     *     findAllUsingForLoop
     * </code>
     * </br>
     * %G% is the date mm/dd/yy
     * Also check the other method
     * @see #findAllUsingForLoop(String, String) The for loop method for the same result
     * @param paragraph The Sentence from where we will find word, which is non-null
     * @param word The Search word, which is non-null
     * @version 1.2.3
     * @since 1.2.0
     *
     *
     */
    static void finaAllUsingWhileLoop(String paragraph, String word){
        int index = paragraph.indexOf(word);


        while (index != -1){
            System.out.println(index);
            index = paragraph.indexOf(word, index+1);
        }
        return;
    }
    static void findAllUsingForLoop(String para, String word){
        int index = para.indexOf(word);
        for (int i = index; i != -1; i = index ) {
            System.out.println(index);
            index = para.indexOf(word, index+1);
        }
    }
    public static void main(String[] args) {
//        String x = "Learning Java";
//        System.out.println(x);
//        System.out.println(x.toLowerCase());
//        System.out.println(x.toUpperCase());
//        x = x.toUpperCase();
//        System.out.println(x);
//        System.out.println(x.indexOf("JAVA")); // Result is 9
        String para = "We are learning Java "+"Java is an awesome language "+"lets have fun with Java";
        String word = "Java";
        System.out.println("Result using For Loop");
        findAllUsingForLoop(para, word);
        System.out.println("Result using While Loop");
        finaAllUsingWhileLoop(para, word);

    }
}
