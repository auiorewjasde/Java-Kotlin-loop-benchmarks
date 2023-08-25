import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J2_Bench_For_Java_Variousno_original3 {
    public static void main(String args[]){
        double a=30000.0;
        long timestart = System.nanoTime();
        for(int i=0;i<100000000;i++){
            
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J2_Bench_For_Java_Variousno_original3.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J2_original3;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J2_original3;time:"+timecount);
    }
}
