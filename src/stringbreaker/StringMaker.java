/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbreaker;

import java.util.Arrays;

/**
 *
 * @author thisajaalwis
 */
public class StringMaker {
    private String s="AAC";
    private int length,min=65,max=69,range=(69 - 65) + 1;
    public StringMaker(int length){ 
        this.length=length;
//        for(int i=0;i<length;i++){
//            int num=(int)(Math.random() * range) + min;
//            s+=(char)num;
//        }
    }
    public String getString(){
        return s;
    }
    public int correct(String guess){
        int cnt=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==guess.charAt(i))cnt++;
        }
        return cnt;
    }
    public int numCorrect(String guess){
        int stringCnt[]=new int[5],guessCnt[]=new int[5],cnt=0;
        for(int i=0;i<length;i++){
            stringCnt[s.charAt(i)-65]++;
            guessCnt[guess.charAt(i)-65]++;
        }
        for(int i=0;i<5;i++)cnt+=Math.min(stringCnt[i], guessCnt[i]);
        return cnt;
    }
}
