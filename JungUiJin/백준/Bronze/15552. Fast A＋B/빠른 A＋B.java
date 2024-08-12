import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /* 버퍼 : 사용자 입력값을 임시로 저장 하기 위한 메모리 */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* StringTokenizer : 하나의 문자열을 여러개의 토큰으로 분리하는 클래스 */
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
//            int A = Integer.parseInt(st.nextToken()); // 첫 번째 토큰
//            int B = Integer.parseInt(st.nextToken()); // 두 번째 토큰
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
