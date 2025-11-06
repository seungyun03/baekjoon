package bronze_java;
import java.io.BufferedReader;
import java.io.IOException;
public class 문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(s.substring(i-1, i));
    }
}