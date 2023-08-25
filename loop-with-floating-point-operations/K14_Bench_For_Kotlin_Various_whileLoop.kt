import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    var i:Int=0
    val size:Int = 100000000
    val timestart:Long=System.nanoTime()
    while(i < size){
        a*=1.0001
        a*=0.9999
        i++
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K14_Bench_For_Kotlin_Various_whileLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K14_whileLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K14_whileLoop;time:"+timecount)

}