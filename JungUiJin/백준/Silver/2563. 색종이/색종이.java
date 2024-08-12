import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] areas = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());

        int totalArea = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            for(int x = width; x <= width+9; x++) {
                for(int y = height; y <= height+9; y++) {
                    areas[x][y] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(areas[i][j]) {
                    totalArea++;
                }
            }
        }
        System.out.println(totalArea);
        br.close();
    }
}
