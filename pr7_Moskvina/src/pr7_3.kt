import kotlin.math.PI

fun main()
{
    println("Введите длину окружности")
    val x=readln()
    val a=x.toDouble()
    if(a>0){
        val radius=a/(2* PI)
        val pl=PI * (radius*radius)
        println("Площадь круга: ${String.format("%.2f",pl)}")
    }
    else println("Длинна окружности не может быть отицательная")
}