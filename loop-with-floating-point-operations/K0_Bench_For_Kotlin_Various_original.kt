import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val timestart:Long=System.nanoTime()
    for(i:Int in 1..100000000){
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K0_Bench_For_Kotlin_Various_original.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K0_original;a;"+a+";timecount;"+timecount+";[ms]")
    println("K0_original;time:"+timecount)
    pw.close()

}