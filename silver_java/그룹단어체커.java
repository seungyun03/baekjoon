import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커 {
     public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0;i<a;i++)
        {
            char[]arr = br.readLine().toCharArray();
            char before = arr[0];
            char[]test = new char[arr.length];
            test[0] = arr[0];
            count+=1;
            for(int k = 1;k<arr.length;k++)
            {
                char fw = arr[k];
                String ex = String.copyValueOf(test);
                if (ex.contains(String.valueOf(fw))&&fw!=before) {
                    count-=1;
                    break;
                }
                test[k] = fw;
                before = fw;
            }
            
        }
        System.out.println(count);
    }
}
