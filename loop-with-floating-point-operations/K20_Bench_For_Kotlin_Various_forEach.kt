import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val array = IntArray(100000000)
    val timestart:Long=System.nanoTime()
    array.forEach {
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K20_Bench_For_Kotlin_Various_forEach.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K20_forEach;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K20_forEach;time:"+timecount)

}