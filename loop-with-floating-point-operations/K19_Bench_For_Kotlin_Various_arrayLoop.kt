import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    var a:Double = 30000.0
    val array = IntArray(100000000)
    val timestart:Long=System.nanoTime()
    for(i:Int in array){
        a*=1.0001
        a*=0.9999
    }
    val timeend:Long=System.nanoTime()
    val timecount:Double = (timeend-timestart)/1000000.0
    val fil = FileWriter("K19_Bench_For_Kotlin_Various_arrayLoop.text",true)
    val pw = PrintWriter(BufferedWriter(fil))
    pw.println("K19_arrayLoop;a;"+a+";timecount;"+timecount+";[ms]")
    pw.close()
    println("K19_arrayLoop;time:"+timecount)

}