import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J4_Bench_For_Java_Variousno_enhanced {
    public static void main(String args[]){
        double a=30000.0;
        int array[]=new int[100000000];
        long timestart = System.nanoTime();
        for(int number:array){
            
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J4_Bench_For_Java_Variousno_enhanced.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J4_enhanced;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J4_enhanced;time:"+timecount);
    }
}
