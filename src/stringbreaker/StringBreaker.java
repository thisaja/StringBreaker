/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbreaker;
import java.util.*;
import java.io.*;
/**
 *
 * @author thisajaalwis
 */
public class StringBreaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chars,guesses;
        String guess;
        
        do{
        System.out.print("Enter how many letters you want to guess(3,4 or 5): ");
        chars=input.nextInt();
        }while(chars<3 || chars>5);
        StringMaker s=new StringMaker(chars);
        System.out.println(s.getString());
        
        System.out.print("Enter how many times you want to guess: ");
        guesses=input.nextInt();
        
        for(int i=0;i<guesses;i++){
            System.out.print("Enter your guess: ");
            guess=input.next();
            System.out.println(s.numCorrect(guess));
        }
        
    }
    
}
