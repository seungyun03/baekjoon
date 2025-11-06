package bronze_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 문자열반복 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] s = new String[t];
        Arrays.fill(s,"");
        for(int i = 0;i<t;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String a = st.nextToken();
            for(int k= 0;k<a.length();k++)
            {
                for(int e = 0;e<r;e++)
                {
                    s[i]+=a.charAt(k);
                }
            }
        }
        for(int i = 0;i<t;i++)System.out.println(s[i]);
    }
}