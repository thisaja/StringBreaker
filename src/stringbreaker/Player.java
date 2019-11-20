package stringbreaker;
public class Player {
	private String guess;
	private int numGuesses,numCorrectPos,numCorrect;
	public Player(int numGuesses) {
		this.numGuesses=numGuesses;
	}
	public void setString(String guess) {
		this.guess=guess;
	}
	public String getString() {
		return guess;
	}
	public int getLength() {
		return guess.length();
	}
	public int getNumGuesses() {
		return numGuesses;
	}
	public void setNumCorrect(StringMaker s) {
        numCorrect=s.numCorrect(guess);
        numCorrectPos=s.numCorrectPos(guess);
	}
	public int getNumCorrect() {
		return numCorrect;
	}
	public int getNumCorrectPos() {
		return numCorrectPos;
	}
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
