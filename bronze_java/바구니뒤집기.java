package bronze_java;
import java.util.Scanner;
public class 바구니뒤집기{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0;i<m;i++)arr[i] = i+1;
        for(int s = 0;s<n;s++)
        {
            int i= sc.nextInt();
            int j= sc.nextInt();
            int k = 0;
            if(i!=j) k = ((j-i)/2)+1; else k = j/i;
            for(int g = 0;g<k;g++)
            {
                int temp = arr[i-1+g];
                arr[i-1+g] = arr[j-1-g]; 
                arr[j-1-g] = temp;
            }
        }
        for(int i = 0;i<m;i++)System.out.print(arr[i]+" ");
        sc.close();
    }
}


