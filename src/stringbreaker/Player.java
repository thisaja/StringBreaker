/*
Programmers: Thisaja Alwis and Michael Li
Date: Novemeber 19, 2019
Course Code: ICS3U
File Name: Player.java
*/
package stringbreaker;
/**
 * Class Description: Creates the player object
 */
public class Player {
    private String guess;
    private int numGuesses,numCorrectPos,numCorrect;
    
    /**
     * Method Description: Sets the numGuesses when you create the object
     * Pre: An Integer
     * Post: None
     */
    public Player(int numGuesses) {
        this.numGuesses=numGuesses;
    }
    
   /**
     * Method Description: Sets the value to setString
     * Pre: A String
     * Post: None
     */    
    public void setString(String guess) {
        this.guess=guess;
    }
    
    /**
     * Method Description: Returns the string value
     * Pre: None
     * Post: The guessed string 
     */    
    public String getString() {
        return guess;
    }
    
   /**
     * Method Description: Returns the string length
     * Pre: None
     * Post: The user's guessed string length
     */    
    public int getLength() {
        return guess.length();
    }
    
    /**
     * Method Description: Returns the user's desired guess amount
     * Pre: None
     * Post: The guesses value as an integer
     */    
    public int getNumGuesses() {
        return numGuesses;
    }    
    
    /**
     * Method Description: Returns the correct values and correct position values
     * Pre: The StringMaker type
     * Post: None
     */  
    public void setNumCorrect(StringMaker s) {
        numCorrect=s.numCorrect(guess);
        numCorrectPos=s.numCorrectPos(guess);
    }
        
    /**
     * Method Description: Returns the number of correct letters
     * Pre: None
     * Post: Returns the number of correct letters
     */  
    public int getNumCorrect() {
        return numCorrect;
    }
        
    /**
     * Method Description: Returns the number of correct letters in the correct position
     * Pre: None
     * Post: Returns the number of correct letters in the correct position
     */  
    public int getNumCorrectPos() {
        return numCorrectPos;
    }
         
    /**
     * Method Description: Determines if the user guessed the string or not
     * Pre: The StringMaker type
     * Post: Returns a boolean to tell if the user is correct
     */  
    public boolean isCorrect(StringMaker s) {
        if(numCorrectPos==s.getLength())return true;
        return false;
    }
    /**
     * Method Description: Checks if the user input is valid or not
     * Pre: A String and an integer
     * Post: Returns a true/false value
     */
    public boolean isValid(StringMaker s) {
    	String randomString = s.getString();
        if(randomString.length()!=guess.length())return false;
        for(int i=0;i<guess.length();i++)if(guess.charAt(i)>=70 || guess.charAt(i)<=64)return false;
        return true;
    }
}
