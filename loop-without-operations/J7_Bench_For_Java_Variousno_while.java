import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J7_Bench_For_Java_Variousno_while {
    public static void main(String args[]){
        double a=30000.0;
        int size=100000000;
        int i=0;
        long timestart = System.nanoTime();
        while(i<size){
            
            i++;
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J7_Bench_For_Java_Variousno_while.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J7_while;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J7_while;time:"+timecount);
    }
}
