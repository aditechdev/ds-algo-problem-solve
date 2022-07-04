package normal_problem;

public class check_vowel {
    public static void main(String[] args) {
        String c = "a";
        int sa = 0;

        switch(c){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                sa = 1;
                break;
            default: sa = 0;
        }
        System.out.println(sa);
    }
}
