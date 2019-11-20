/*
Programmers: Thisaja Alwis and Michael Li
Date: Novemeber 19, 2019
Course Code: ICS3U
File Name: StringMaker.java
*/
package stringbreaker;

/**
 * Class Description: Creates a random string 
 */
public class StringMaker {
    private String randomString="";
    private final int MIN=65,MAX=69,RANGE=(MAX - MIN) + 1,LENGTH;
    
    /**
     * Method Description: Creates the random string based on the length required
     * Pre: An integer value
     * Post: None
     */
    public StringMaker(int length){ 
        this.LENGTH=length;
        for(int i=0;i<length;i++){
            double num=(int)(Math.random()*RANGE) + MIN;
            randomString+=(char)num;
        }
    }
    
    /**
     * Method Description: Returns the generated string
     * Pre: None
     * Post: The string 
     */
    public String getString() {
    	return randomString;
    }
    
    /**
     * Method Description: Returns the length of the generated string
     * Pre: None
     * Post: The integer length of the string 
     */
    public int getLength() {
    	return LENGTH;
    }
    
    /**
     * Method Description: Checks the user's input against the generated string to find the number
     *                     of letters that are in the correct position
     * Pre: Users string guess
     * Post: An integer displaying the number of correct letters in the right position
     */
    public int numCorrectPos(String guess){
        int cnt=0;
        for(int i=0;i<LENGTH;i++){
            if(randomString.charAt(i)==guess.charAt(i))cnt++;
        }
        return cnt;
    }
    
    /**
     * Method Description: Checks the user's input against the generated string to find the number
     *                     of unique letters that are correct
     * Pre: Users string guess
     * Post: An integer displaying the number of unique letters that are in the generated string
     */
    public int numCorrect(String guess){
        int stringCnt[]=new int[5],guessCnt[]=new int[5],cnt=0;
        for(int i=0;i<LENGTH;i++){
            stringCnt[randomString.charAt(i)-65]++;
            guessCnt[guess.charAt(i)-65]++;
        }
        for(int i=0;i<5;i++)cnt+=Math.min(stringCnt[i], guessCnt[i]);
        return cnt;
    }
}
