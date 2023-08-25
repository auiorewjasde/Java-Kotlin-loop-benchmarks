import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J0_Bench_For_Java_Various_original {
    public static void main(String args[]){
        double a=30000.0;
        long timestart = System.nanoTime();
        for(int i=1;i<=100000000;i++){
            a*=1.0001;
            a*=0.9999;
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J0_Bench_For_Java_Various_original.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J0_original;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J0_original;time:"+timecount);
    }

}
