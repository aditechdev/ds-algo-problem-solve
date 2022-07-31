package basic.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LexicographicOrder {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("guava");
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("lemon");
        // This will sort in lexicographic order(The way it is sort in dictionary)
        Collections.sort(fruits);
        // for reverse order
        Collections.sort(fruits, Collections.reverseOrder());

        for (String x: fruits
             ) {
            System.out.println(x);

        }
    }
}
