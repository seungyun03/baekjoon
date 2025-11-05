package bronze_java;

import java.util.Scanner;

public class 공넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]nums =  new int[n];
        int count = 0;
        while (count<m){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int g = i-1;g<j;g++)
            {
                nums[g] = k;
            }
            ++count;
        }
        sc.close();
        for(int h = 0;h<n;h++)
        {
            System.out.println(nums[h]);
        }
    }
}
