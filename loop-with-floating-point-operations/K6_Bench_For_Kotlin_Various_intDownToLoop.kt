import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 100000000
    val timestart:Long=System.nanoTime()
    for(i:Int in size downTo 1){
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K6_Bench_For_Kotlin_Various_intDownToLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K6_intDownToLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K6_intDownToLoop;time:"+timecount)

}