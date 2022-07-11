package basic.array;

public class passByValue {
//https://www.cs.virginia.edu/~jh2jf/courses/cs2110/java-pass-by-value.html
    static void passByValue(int[] arr){
        for (int i =0; i <arr.length; i++){
            arr[i] = 2*arr[i];
        }
    }

    public static void main(String[] args) {
    int[] arr = {10,20,30};

    passByValue(arr); // This change the value of above arr
        /**
         * output is
         * 20
         * 40
         * 60
         */
        for (int x:arr
             ) {
            System.out.println(x);

        }
    }
}
