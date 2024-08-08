package study;

import java.util.Scanner;

public class Main3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] check = new int[6];
        int [] right = {1,1,2,2,2,8};
        int [] result = new int[6];
        for(int i = 0 ; i < 6 ; i++){
            check[i] = sc.nextInt();
            result[i] = right[i]-check[i];
        }
        for(int i = 0 ; i < 6 ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
