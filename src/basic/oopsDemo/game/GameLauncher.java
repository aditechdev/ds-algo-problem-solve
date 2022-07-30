package basic.oopsDemo.game;

import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        // Test our player
        GameLogic gameLogic = new GameLogic("Aditya", "Anand", "Adi");
        gameLogic.launch();


    }
}

// Another class (Game Logic)
class GameLogic{
    PlayerClass p1;
    PlayerClass p2;
    PlayerClass p3;
    GameLogic(String name1, String name2, String name3){
//        this.p1.name = name1;
        p1 = new PlayerClass(name1);
        p2 = new PlayerClass(name2);
        p3 = new PlayerClass(name3);

    }

    boolean checkWinner(int expectedGuess){
        if(p1.number == expectedGuess){
            System.out.println(p1.name+" is the winner");
            return true;
        }
        else if (p2.number == expectedGuess) {
            System.out.println(p2.name + " is the winner");
            return true;

        }
        else if (p3.number == expectedGuess) {
            System.out.println(p3.name+" is the winner");
            return true;

        }
        return false;
    }
    void launch(){
        int expectedGuess = (int)(Math.random()*10);
        System.out.println("Guess expected is " +expectedGuess);
       while (true){
           p1.guess();
           p2.guess();
           p3.guess();

           if (checkWinner(expectedGuess) == true){
               break;
           }else {
               System.out.println("Try Again");
           }
       }



    }


//    PlayerClass p1 = new PlayerClass("Aditya");
//        p1.guess();
//    PlayerClass p2 = new PlayerClass("Anand");
//        p2.guess();

}

// Another class (Player Class)

class PlayerClass{
    String name;
    int number;
    static Scanner sc = new Scanner(System.in);
    PlayerClass(String name){
        this.name = name;
    }

    void guess(){
        // take input from the user to make a guess
        number =  (int)(Math.random()* 10);  //sc.nextInt();
        System.out.println(name+ " guessed the number: " + number);
    }

}