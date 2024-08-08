package study;

import java.util.Scanner;

public class Main25206 {
    public static void main(String[] args) {
        String [] name = new String[20];
        double []  num = new double[20];
        String [] score = new String[20];

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<20;i++){
            String [] total = sc.nextLine().split(" ");
            name[i] = total[0];
            num[i] = Double.parseDouble(total[1]);
            score[i] = total[2];
            if(score[i].equals("P")){
                num[i] = 0;
            }
        }
        double [] grade = new  double[20];
        for (int i = 0; i < score.length; i++) {
            switch (score[i]) {
                case "A+": grade[i] = 4.5; break;
                case "A0": grade[i] = 4.0; break;
                case "B+": grade[i] = 3.5; break;
                case "B0": grade[i] = 3.0; break;
                case "C+": grade[i] = 2.5; break;
                case "C0": grade[i] = 2.0; break;
                case "D+": grade[i] = 1.5; break;
                case "D0": grade[i] = 1.0; break;
                case "F": grade[i] = 0.0; break;
            }
        }
        double sum =0 ;
        int totalnum = 0 ;
        for(int i = 0; i < 20; i++) {
            sum += num[i]*grade[i];
            totalnum += num[i];
        }
        System.out.println(sum/totalnum);
    }
}