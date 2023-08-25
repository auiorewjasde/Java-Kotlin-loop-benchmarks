import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 100000000
    val timestart:Long=System.nanoTime()
    for(i:Int in 0 until size){ 
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K10_Bench_For_Kotlin_Variousno_intUntilLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K10_intUntilLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K10_intUntilLoop;time:"+timecount)

}