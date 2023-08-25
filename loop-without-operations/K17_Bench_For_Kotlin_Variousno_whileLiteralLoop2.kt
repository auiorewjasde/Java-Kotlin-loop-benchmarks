import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    var i:Int=0
    val timestart:Long=System.nanoTime()
    while(i <= 99999999){
        
        i++
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K17_Bench_For_Kotlin_Variousno_whileLiteralLoop2.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K17_whileLiteralLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K17_whileLiteralLoop2;time:"+timecount)

}