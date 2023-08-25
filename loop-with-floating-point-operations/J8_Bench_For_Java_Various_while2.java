import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J8_Bench_For_Java_Various_while2 {
    public static void main(String args[]){
        double a=30000.0;
        int size=99999999;
        int i=0;
        long timestart = System.nanoTime();
        while(i<=size){
            a*=1.0001;
            a*=0.9999;
            i++;
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J8_Bench_For_Java_Various_while2.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J8_while2;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J8_while2;time:"+timecount);
    }
}

