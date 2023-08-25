import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class J6_Bench_For_Java_Various_arraylength2 {
    public static void main(String args[]){
        double a=30000.0;
        int array[]=new int[100000000];
        long timestart = System.nanoTime();
        for(int i=1;i<=array.length;i++){
            a*=1.0001;
            a*=0.9999;
        }
        long timeend = System.nanoTime();
        double timecount = (timeend - timestart)/1000000.0;
        try {
            FileWriter fil = new FileWriter("J6_Bench_For_Java_Various_enhanced2.text", true);
            PrintWriter pw = new PrintWriter(fil);
            pw.println("J6_arraylength2;a;"+a+";timecount;"+timecount);
            pw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("J6_arraylength2;time:"+timecount);
    }
}
