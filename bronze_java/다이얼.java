package bronze_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 다이얼 {
    public static void main(String[] args)throws IOException {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(char c : br.readLine().toCharArray())
            if ((int)c>64&&(int)c<=79)sum+=(((int)c-59)/3)+1;
             else if ((int)c>79&&(int)c<=83) sum+=8;
                 else if ((int)c>83&&(int)c<=86)sum+=9;
                        else sum+=10;
         System.out.println(sum);
    }
}

