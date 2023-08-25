import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val timestart:Long=System.nanoTime()
    for(i:Int in 100000000 downTo 1){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K8_Bench_For_Kotlin_Variousno_intDownToLiteralLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K8_intDownToLiteralLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K8_intDownToLiteralLoop;time:"+timecount)

}