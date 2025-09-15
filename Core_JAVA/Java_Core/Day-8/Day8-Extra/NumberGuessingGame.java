import java.util.*;
public class NumberGuessingGame {
    public static int generateGuess(int low,int high){ return low + (int)(Math.random()*(high-low+1)); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int low=1, high=100;
        String feedback="";
        while(!feedback.equals("correct")){
            int guess=generateGuess(low,high);
            System.out.println("Is it "+guess+"? (high/low/correct)");
            feedback=sc.next();
            if(feedback.equals("high")) high=guess-1;
            else if(feedback.equals("low")) low=guess+1;
        }
        System.out.println("Guessed!");
        sc.close();
    }
}
