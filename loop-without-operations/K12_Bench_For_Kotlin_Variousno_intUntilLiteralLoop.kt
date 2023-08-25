import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val timestart:Long=System.nanoTime()
    for(i:Int in 0 until 100000000){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K12_ench_For_Kotlin_Variousno_intUntilLiteralLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K12_intUntilLiteralLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K12_intUntilLiteralLoop;time:"+timecount)

}