package study;

import java.util.Scanner;

public class Main2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String [] list = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int count =  0;
        for(int i = 0; i < list.length; i++) {
            while(word.contains(list[i])) {
                word = word.replace(list[i], "K");
            }
        }
        System.out.println(word.length());
    }
}