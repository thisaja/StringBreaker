/*
Programmers: Thisaja Alwis and Michael Li
Date: Novemeber 19, 2019
Course Code: ICS3U
File Name: StringBreaker.java
Description: Application allows user to play a game
*/
package stringbreaker;
import java.util.*;
/**
 * Class Description: Client code, lets user decide various parameters
 */
public class StringBreaker {

    /**
     * Method Description: Checks if the user input is valid or not
     * Pre: A String and an integer
     * Post: Returns a true/false value
     */
    private static boolean isValid(String s,int length) {
            if(s.length()!=length)return false;
            for(int i=0;i<s.length();i++)if(s.charAt(i)>=70)return false;
            return true;
    }
	
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StringMaker randomString;
        String guess;
        int chars, guesses, correct, numCorrect;
        boolean isCorrect = false;
        
        do {
            System.out.print("Enter how many letters you want to guess (3, 4 or 5): ");
            chars=input.nextInt();
        } while (chars<3 || chars>5);
        
        randomString=new StringMaker(chars);
        
        System.out.print("Enter how many times you want to guess: ");
        guesses=input.nextInt();
        
        for(int i=0;i<guesses;i++){
            System.out.println("");

            do {
                System.out.print("Enter your guess: ");
                guess=input.next().toUpperCase();
            } while(!isValid(guess,randomString.getLength()));
        	
            numCorrect=randomString.numCorrectLetter(guess);
            correct=randomString.numCorrectPos(guess);
            System.out.println(numCorrect+" of the letters you guessed were right and "+correct+" were in the right position.");
            
            if(correct==randomString.getLength()) {
            	isCorrect=true;
            	break;
            }   
        }
        input.close();
        if(isCorrect)System.out.println("Good Job! You guessed the string!!!");
        else System.out.println("Nice Try! The correct answer was "+randomString.getString()+".");   
    }  
}
