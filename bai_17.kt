fun tong(a:Double, b:Double){
    println("$a + $b = ${a+b}")
}
fun hieu(a:Double, b:Double){
    println("$a - $b = ${a-b}")
}
fun tich(a:Double, b:Double){
    println("$a * $b = ${a*b}")
}
fun thuong(a:Double, b:Double){
    if(b == 0.0){
        println("Không chia được")
    }

    println("$a / $b = ${a/b}")
}

fun main(args: Array<String>) {
    println("nhập vào số a: ")
    var a:Double? = readLine()?.toDouble()
    println("nhập vào số b: ")
    var b:Double? = readLine()?.toDouble()
    println("nhập vào phép tính(+,-,*,/) ")
    var c:String? = readLine()?.toString()
    if(a != null && b != null && c != null){
        if(c == "+")
            tong(a,b)
        else if(c == "-")
            hieu(a,b)
        else if(c == "*")
            tich(a,b)
        else if(c == "/")
            thuong(a,b)
        else {
            println("Phép toán không hợp lệ!")
        }

    }
}