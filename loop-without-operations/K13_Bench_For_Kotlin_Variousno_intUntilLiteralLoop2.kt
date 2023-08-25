import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val timestart:Long=System.nanoTime()
    for(i:Int in 1 until 100000001){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K13_Bench_For_Kotlin_Variousno_intUntilLiteralLoop2.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K13_intUntilLiteralLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K13_intUntilLiteralLoop2;time:"+timecount)

}