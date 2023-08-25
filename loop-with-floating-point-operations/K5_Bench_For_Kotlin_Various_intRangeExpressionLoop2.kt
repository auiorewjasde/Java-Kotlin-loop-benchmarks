import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 99999999
    val intRange = 0..size
    val timestart:Long=System.nanoTime()
    for(i:Int in intRange){
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K5_Bench_For_Kotlin_Various_intRangeExpressionLoop2.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K5_intRangeExpressionLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K5_intRangeExpressionLoop2;time:"+timecount)

}