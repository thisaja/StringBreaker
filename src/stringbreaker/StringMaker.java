package stringbreaker;

/**
 *
 * @author thisajaalwis
 */
public class StringMaker {
    private String s="";
    private int length, min=65,max=69,range=(max - min) + 1;
    public StringMaker(int length){ 
        this.length=length;
        for(int i=0;i<length;i++){
            int num=(int)(Math.random()*range) + min;
            s+=(char)num;
        }
    }
    public String getString() {
    	return s;
    }
    public int getLength() {
    	return length;
    }
    public int numCorrectPos(String guess){
        int cnt=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==guess.charAt(i))cnt++;
        }
        return cnt;
    }
    public int numCorrectLetter(String guess){
        int stringCnt[]=new int[5],guessCnt[]=new int[5],cnt=0;
        for(int i=0;i<length;i++){
            stringCnt[s.charAt(i)-65]++;
            guessCnt[guess.charAt(i)-65]++;
        }
        for(int i=0;i<5;i++)cnt+=Math.min(stringCnt[i], guessCnt[i]);
        return cnt;
    }
}
