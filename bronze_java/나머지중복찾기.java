package bronze_java;

import java.util.Arrays;
import java.util.Scanner;
public class 나머지중복찾기 {
    public static void main(String[] args) {
        int arr[] = new int[101];
        Arrays.fill(arr,-1);
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            int num = sc.nextInt()%42;
            arr[num] = num;
        }
        for(int k : arr)
        {
            if (k != -1) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}