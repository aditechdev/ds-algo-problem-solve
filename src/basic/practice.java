package basic;

public class practice {
    public static int isvowel(char c){

        switch(c){
            case 'a':

            case 'o':
            case 'e':

            case 'i':

            case 'u':
                return 1;

            default: return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println( isvowel('A'));

    }
}
