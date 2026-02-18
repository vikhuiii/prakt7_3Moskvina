import kotlin.math.pow

fun main(){
    println("Введите x")
    val x=readln().toDouble()
    println("Введите букву функции")
    val b=readln().toString()
    var res=0.0
    when{
        b=="а"->{if(x<-1){println("Ошибка")}
            else if(x>=-1&&x<1){res=-x.pow(2)+1}
            else {res=x-1}
        }
        b=="б"->{
            if(x<-1||x>4){println("Ошибка")}
            else if(x>=-1&&x<0){res=x+1}
            else if(x>=0&&x<3){res=1.0}
            else{res=-x+4}
        }
        b=="в"->{
            if(x<-1){println("Ошибка")}
            else if(x>=-1&&x<=0){res=x+1}
            else if(x>0&&x<=1){res=-x+1}
            else if(x>1&&x<3){ res=0.5*x-0.5}
            else {res=1.0}
        }
        b=="г"->{
            if(x<-1){println("Ошибка")}
            else if(x>=-1&&x<0){ res=-x.pow(2)+1}
            else { res=1.0}
        }
        else->{println("Ошибка")}
    }
    println("Значение функции $b от x=$x: $res")
}