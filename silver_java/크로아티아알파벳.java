import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳 {
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String arr = br.readLine();
        String temp = arr;
        while (arr.length()>=1) {
            char[]s = arr.toCharArray();
            String ex = String.valueOf(s[0]);
            String a3 = ""; 
            if(arr.length()>=3) a3= String.valueOf(s[0])+String.valueOf(s[1])+String.valueOf(s[2]);
            String a2 = "";
            if(arr.length()>=2) a2 = String.valueOf(s[0])+String.valueOf(s[1]);

            if(arr.length()>=3&&a3.contains("dz="))
            {
                arr = arr.replaceFirst("dz=", "");
                count+=1;
                continue;
            }
            if (arr.length()>=2&&a2.contains("c=")||a2.contains("c-")||a2.contains("d-")||a2.contains("lj")||a2.contains("nj")||a2.contains("s=")||a2.contains("z=")) {
                arr = arr.replaceFirst(a2,"");
                count+=1;
                continue;
            } 
            arr= arr.replaceFirst(ex,"");
            count+=1;
    }
    System.out.println(count);
}
}
