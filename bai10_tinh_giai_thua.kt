//fun main(args: Array<String>) {
//    var gt = 1;
//    println("nhap vao so nguyen n: ")
//    var n: Int? = readLine()?.toInt()
//    if(n != null){
//        for(i in 1 .. n ){
//            gt *=i;
//        }
//    }
//    println("$n! = $gt")
//}

fun main(args: Array<String>) {
    var gt = 1
    var i = 1
    println("nhap vao so nguyen n: ")
    var n: Int? = readLine()?.toInt()
    if(n != null){
        while(i <= n){
            gt *= i
            i++
         }
    }
    println("$n! = $gt")
}