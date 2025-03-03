fun main(args: Array<String>) {
    var n:Int
    var tong = 0
    println("nhap số nguyên n = ")
    n = readLine()!!.toInt()
    if(n != null){
        if(n % 2 != 0){
            for (i in 1..n step 2) {
                if(i == 3){
                    continue
                }
                tong += i

            }
        }
    }
    println("tong là $tong")
}