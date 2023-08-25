import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    var i:Int=0
    val size:Int = 99999999
    val timestart:Long=System.nanoTime()
    while(i <= size){
        
        i++
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K15_Bench_For_Kotlin_Variousno_whileLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K15_whileLoop2;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K15_whileLoop2;time:"+timecount)

}