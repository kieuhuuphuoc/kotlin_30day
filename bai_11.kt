fun main(args: Array<String>) {
    var tong = 0
    println("nhap so nguyên n = ")
    var n:Int? = readLine()?.toInt()
    if(n!= null){
        if(n%2 == 0){
            for(i in 0..n step 2)
                tong += i
        }
        else
            println("tôi không tính số lẻ")

    }
  println("tong cua n = $n là $tong")
}