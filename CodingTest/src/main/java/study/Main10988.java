package study;

import java.util.Scanner;

public class Main10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char [] words = word.toCharArray();
        int result =0;
        for(int i=0; i< words.length/2;i++){
            if(words[i] == words[words.length-i-1]){
                result++;
            }
        }
        if(result==words.length/2){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}