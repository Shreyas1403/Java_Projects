package Java_Project.Src;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Hello ! welcome to Guess the Number Game");
        System.out.println("The number will be between 1 to 10, so guess properly ");
        guessTheNumber();
    }
    public static void guessTheNumber(){
        Scanner input = new Scanner(System.in);
        int guess;
        int random = (int) Math.round(Math.random()*10);
        System.out.print("Enter guess number here : ");
        guess = input.nextInt();
        if(guess == random){
            System.out.println("The number is : " +random +" " +" Congratulation");
            return;
        }
        else {
            System.out.println("Looser!!!!");
            guessTheNumber();
        }
    }
}
