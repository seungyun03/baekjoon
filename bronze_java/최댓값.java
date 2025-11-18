package bronze_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int row = 0;
        int col = 0;
        int max = 0;
        int arr[][] = new int[9][9];
        for(int i = 0;i<9;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int k = 0;k<9;k++)
            {
                arr[i][k] = Integer.parseInt(st.nextToken());
                if (arr[i][k]>max) {
                    max = arr[i][k];
                    row = i;
                    col = k;
                }
            }
            
        }
        System.out.println(max+"\n"+(row+1)+" "+(col+1));
    }
}
