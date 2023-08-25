import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val timestart:Long=System.nanoTime()
    for(i:Int in 0..99999999){
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K1_Bench_For_Kotlin_Various_original2.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K1_original2;a;"+a+";timecount;"+timecount+";[ms]")
    println("K1_original2;time:"+timecount)
    pw.close()

}