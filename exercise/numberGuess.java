package exercise;

import java.util.Scanner;

public class numberGuess {
    int random;
    numberGuess(){
        random = (int)(Math.random()*100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }
    public static void main(String[] args) {

        int num;
        numberGuess g1 = new numberGuess();
        System.out.println(g1);
        Scanner sc = new Scanner(System.in);
        int result;
        do {
            System.out.println("Please guess a numer and write down here: ");
            num = sc.nextInt();
            result = g1.guess(num);

            if(result == 0){
                System.out.println("congrats, you havw won");
            } else if (result<0) {
                System.out.println("guess Higher");
            }else{
                System.out.println("Guess lower.");
            }
        }while(result!=0);

    }
}
