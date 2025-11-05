package bronze_java;
import java.util.Scanner;
public class 과제안내신분 {
    public static void main(String[] args) {
        int arr[] = new int[30];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<28;i++)
        {
            arr[sc.nextInt()-1] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<30;i++)
        {
            if(arr[i]==0)
            {
                System.out.println(i+1);
            }
        }
    }
}