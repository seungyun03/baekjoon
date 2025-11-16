package bronze_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬덧셈 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[][] = new int[n][m];
        for(int i = 0;i<(m*(n-1))+1;i+=m)
        {
            st = new StringTokenizer(br.readLine());
            arr[i/m][0] = Integer.parseInt(st.nextToken());
            arr[i/m][1] = Integer.parseInt(st.nextToken());
            arr[i/m][2] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<(m*(n-1))+1;i+=m)
        {
            st = new StringTokenizer(br.readLine());
            arr[i/m][0] += Integer.parseInt(st.nextToken());
            arr[i/m][1] += Integer.parseInt(st.nextToken());
            arr[i/m][2] += Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<(m*(n-1))+1;i+=m)
        {
         
            System.out.println(arr[i/m][0]+" "+arr[i/m][1]+" "+arr[i/m][2]);
           
        }

    }
}
        