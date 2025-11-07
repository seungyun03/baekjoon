package bronze_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수  {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder s1 = new StringBuilder(st.nextToken());
        StringBuilder s2 = new StringBuilder(st.nextToken());
        System.out.println(Math.max(Integer.parseInt(s1.reverse().toString()),Integer.parseInt(s2.reverse().toString())));

    }
    
}
