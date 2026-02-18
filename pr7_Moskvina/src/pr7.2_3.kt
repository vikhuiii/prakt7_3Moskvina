fun main(){
    println("Введите x, y, z")
    val x=readln().toDouble()
    val y=readln().toDouble()
    val z=readln().toDouble()
    var res:Double
    when{
        x<z->{
            if(x>y) res=x
            else res=y
        }
        x>=z->{
            if(x<y) res = x
            else res=y
        }
        else->{
            res=x
        }
    }
    println("Результат: $res")
}