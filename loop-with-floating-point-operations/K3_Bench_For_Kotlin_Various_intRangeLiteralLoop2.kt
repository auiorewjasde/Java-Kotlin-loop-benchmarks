import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 99999999
    val timestart:Long=System.nanoTime()
    for(i:Int in 0..size){
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K3_Bench_For_Kotlin_Various_intRangeLiteralLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K3_intRangeLiteralLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K3_intRangeLiteralLoop2;time:"+timecount)

}