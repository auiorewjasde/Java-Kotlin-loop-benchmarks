import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 100000000
    val timestart:Long=System.nanoTime()
    for(i:Int in 1..size){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K2_Bench_For_Kotlin_Variousno_intRangeLiteralLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K2_intRangeLiteralLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K2_intRangeLiteralLoop;time:"+timecount)

}