import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val timestart:Long=System.nanoTime()
    for(i:Int in 99999999 downTo 0){
        
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K9_Bench_For_Kotlin_Variousno_intDownToLiteralLoop2.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K9_intDownToLiteralLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K9_intDownToLiteralLoop2;time:"+timecount)

}