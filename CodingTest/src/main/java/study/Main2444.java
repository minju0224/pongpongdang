package study;

import java.util.Scanner;

public class Main2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = num-i ; j >0  ; j--){
                System.out.print(" ");
            }
            for(int j = 2*i-1 ; j >0  ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num-1; i >= 0; i--){
            for(int j = num-i ; j >0  ; j--){
                System.out.print(" ");
            }
            for(int j = 2*i-1 ; j >0  ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}