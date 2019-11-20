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
	
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StringMaker randomString;
        Player player;
        int numLetters;
        
        do {
            System.out.print("Enter how many letters you want to guess (3, 4 or 5): ");
            numLetters=input.nextInt();
        } while (numLetters<3 || numLetters>5);
        
        randomString=new StringMaker(numLetters);
        
        System.out.print("Enter how many times you want to guess: ");
        player=new Player(input.nextInt());
        
        for(int i=0;i<player.getNumGuesses();i++){
            System.out.println("");

            do {
                System.out.print("Enter your guess: ");
                player.setString(input.next().toUpperCase());
            } while(!player.isValid(randomString));
        	
            player.setNumCorrect(randomString);
            System.out.println(player.getNumCorrect()+" of the letters you guessed were right and "+player.getNumCorrectPos()+" were in the right position.");
            
            if(player.isCorrect(randomString))break;
        }
        input.close();
        if(player.isCorrect(randomString))System.out.println("Good Job! You guessed the string!!!");
        else System.out.println("Nice Try! The correct answer was "+randomString.getString()+".");   
    }  
}
