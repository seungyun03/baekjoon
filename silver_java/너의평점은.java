import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class 너의평점은 {
    public static void main(String[] args)throws IOException {
        double sum = 0;
        String grade[] = {"F","D0","D+","C0","C+","B0","B+","A0","A+"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double subjectCount = 0;
        for(int i = 0;i<20;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dump = st.nextToken();
            double gradeCount = Double.parseDouble(st.nextToken());
            String grade2 = st.nextToken();
            for(int k = 0;k<9;k++)
                if (grade2.equals(grade[k])&&!grade2.equals("P")) {
                    if(grade2.equals("F"))
                    {
                        subjectCount+=gradeCount;
                        break;
                    }
                    sum += gradeCount*((k*(0.5))+0.5);
                    subjectCount+=gradeCount;
                    break;
                }
        } 
        System.out.println(sum/subjectCount);
    }
}
