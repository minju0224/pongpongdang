import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        label:
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            int[] nums = new int[26];
            nums[s.charAt(0) - 'a'] = 1;
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j) == s.charAt(j-1)){
                    nums[s.charAt(j) - 'a']++;
                }else if(nums[s.charAt(j) - 'a']==0){
                    nums[s.charAt(j) - 'a']++;
                }else{
                    continue label;
                }
            }
            count++;
        }
        System.out.println(count);
        br.close();
    }
}
