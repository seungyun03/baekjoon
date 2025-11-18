package bronze_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 세로읽기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[][] = new char[5][15];
        int row[] = new int[5];
        int maxCol = 0;
        for(int i = 0;i<5;i++)
        {
            char string1[] = br.readLine().toCharArray();
            row[i] = string1.length;
            if (row[i]>maxCol) {
                maxCol = row[i];
            }
            for(int k=0;k<string1.length;k++)
            {
                arr[i][k] = string1[k];
            }
        }
        for(int i = 0;i<maxCol;i++)
        {
            for(int k = 0;k<5;k++)
            {
                if (arr[k][i]=='\0') {
                    continue;
                }
                System.out.print(arr[k][i]);
            }
        }
    }
}
