import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J1_Bench_For_Java_Variousno_original2 {
    public static void main(String args[]){
        double a=30000.0;
        int size=100000000;
        long timestart = System.nanoTime();
        for(int i=1;i<=size;i++){
            
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J1_Bench_For_Java_Variousno_original2.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J1_original2;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J1_original2;time:"+timecount);
    }
}
