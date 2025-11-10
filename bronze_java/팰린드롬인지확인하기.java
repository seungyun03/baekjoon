package bronze_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 팰린드롬인지확인하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        char[]arr = br.readLine().toCharArray();
        for(int i = 0;i<arr.length/2;i++)if(arr[i]==arr[arr.length-i-1])t+=1;
        if (t==arr.length/2)System.out.println(1);
        else System.out.print(0);
    }
}
