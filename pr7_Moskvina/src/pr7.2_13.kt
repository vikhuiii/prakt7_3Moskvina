import kotlin.math.sqrt

fun main(){
    println("Введите k")
    val k=readln().toDouble()
    println("Введите b")
    val b=readln().toDouble()
    println("Введите a")
    val a=readln().toDouble()
    when{
        k==0.0->{
            if(b==0.0){
                if(a==0.0) println("Прямая и гипербола совпадают")
                else println("Точек пересечения нет")
            }
            else{
                val x=a/b
                val y=b
                println("Найдена одна точка пересечаения: P($x;$y")
            }
        }
        else->{
            val D=b*b+4*k*a
            if (D<0) println("Точек пересечения нет")
            else if(D==0.0){
                val x=-b/(2*k)
                val y=k*x+b
                println("Найдена одна точка пересечаения: P($x;$y")
            }
            else{
                val kD= sqrt(D)
                val x1=(-b+kD)/2*k
                val x2=(-b-kD)/2*k
                val y1=k*x1+b
                val y2=k*x2+b
                println("Найдено две точки пересечения:")
                println("P1($x1;$y1)")
                println("P2($x2;$y2)")

            }
        }
    }
}