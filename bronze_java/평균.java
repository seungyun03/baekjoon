package bronze_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        float[]arr = new float[n];
        float max = 0;
        float sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>max)max = arr[i]; 
        }
        for(int i = 0;i<n;i++)
        {
            arr[i] = arr[i]/max*100;
            sum+=arr[i];
        }
        System.out.println(sum/n);
    }
}

