package bronze_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 킹퀸룩비숍나이트폰 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int arr[] = new int[]{1,1,2,2,2,8};
        for(int i =0;i<6;i++) arr[i] = arr[i]-Integer.parseInt(st.nextToken());
        for(int i =0;i<6;i++)
        {
           System.out.print(arr[i]+" ");
        }
    }
    
}