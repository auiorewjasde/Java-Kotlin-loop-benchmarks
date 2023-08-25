import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J3_Bench_For_Java_Various_original4 {
    public static void main(String args[]){
        double a=30000.0;
        int size=100000000;
        long timestart = System.nanoTime();
        for(int i=0;i<size;i++){
            a*=1.0001;
            a*=0.9999;
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J3_Bench_For_Java_Various_original4.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J3_original4;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J3_original4;time:"+timecount);
    }
}
