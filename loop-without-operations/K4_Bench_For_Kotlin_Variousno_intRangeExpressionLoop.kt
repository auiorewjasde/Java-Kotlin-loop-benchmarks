import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 100000000
    val intRange = 1..size
    val timestart:Long=System.nanoTime()
    for(i:Int in intRange){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K4_Bench_For_Kotlin_Variousno_intRangeExpressionLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K4_intRangeExpressionLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K4_intRangeExpressionLoop;time:"+timecount)

}