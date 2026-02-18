fun main(){
    println("Введите координаты x1 и y2")
    val x1=readln().toDouble()
    val y1=readln().toDouble()
    println("Введите координаты x2 и y2")
    val x2=readln().toDouble()
    val y2=readln().toDouble()
    println("Введите координаты x3 и y3")
    val x3=readln().toDouble()
    val y3=readln().toDouble()

    val a=Math.sqrt(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2.0))
    val b=Math.sqrt(Math.pow(x3-x2,2.0)+Math.pow(y3-y2,2.0))
    val c=Math.sqrt(Math.pow(x1-x3,2.0)+Math.pow(y1-y3,2.0))
    if (a+b>c&&a+c>b&&b+c>a){
        val per=a+b+c
        val v1=y2-y1
        val v2=x1-x2
        val v3=x2*y1-x1*y2
        val res=v1*x3+v2*y3+v3
        val h:Double
        if(res<0){
            h=-res/Math.sqrt(v1*v1+v2*v2)
        }
        else{
            h=res/Math.sqrt(v1*v1+v2*v2)
        }
        val pl=(a*h)/2
        println("Результаты:")
        println("Периметр: ${String.format("%.2f",per)}")
        println("Площадь: ${String.format("%.2f",pl)}")
    }
}