package study;

import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        int [] alp = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alp[s.charAt(i) - 'A']++;
        }
        int max = 0;
        int word = 0;
        for (int i = 0; i < 26; i++) {
            if(alp[i] > max) {
                max = alp[i];
                word = i;
            }
        }
        int check = 0;
        for (int i = 0; i < 26; i++) {
            if(alp[i] == max){
                check++;
            }
        }

        if(check>1){
            System.out.println("?");
        }else{
            System.out.println((char)(word+'A'));
        }
    }
}