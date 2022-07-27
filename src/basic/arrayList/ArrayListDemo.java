package basic.arrayList;

import java.util.ArrayList;

/**
 * This is documentation Comment
 *
 * Java has inbuilt library for data structure which is known as collection framework
 * This framework provides us the predefined data structure
 * ArrayList is more powerful than array
 * It can dynamic go and shrink in size
 * Internally it uses array
 * ArrayList is wrapper over array
 *
 * @author Aditya Anand
 *
 *
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        // We use Integer and not int as it's a wrapper class
        ArrayList<Integer> arrayListNew = new ArrayList<>(100);
        arrayListNew.add(5);
        arrayListNew.add(6);
        arrayListNew.add(7);
        arrayListNew.add(9);
        arrayListNew.add(10);
        arrayListNew.add(2, 10);
        Integer hereisObj = 6;
        arrayListNew.remove(hereisObj);

        for (int i = 0; i < arrayListNew.size(); i++) {
            System.out.println(arrayListNew.get(i));

        }

    }

}
