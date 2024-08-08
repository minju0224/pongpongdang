package study;

import java.util.Scanner;

public class Main1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] words = new String [n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        int count = n;
        for (int i = 0; i < n; i++) {
            label:
            for(int j = 0; j < words[i].length()-1; j++) {
                if(words[i].charAt(j) != words[i].charAt(j+1)) {
                    char check = words[i].charAt(j);
                    for(int k = j+1; k < words[i].length(); k++) {
                        if(check == words[i].charAt(k)){
                            count--;
                            break label;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
