import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val size:Int = 99999999
    val timestart:Long=System.nanoTime()
    for(i:Int in size downTo 0){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K7_Bench_For_Kotlin_Variousno_intDownToLoop2.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K7_intDownToLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K7_intDownToLoop2;time:"+timecount)

}