import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int count = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==' ' && i!=word.length()-1){
                count++;
            } else if (i==0 && word.charAt(i)!=' ') {
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }

}
