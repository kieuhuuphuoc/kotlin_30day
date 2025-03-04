import kotlin.random.Random

fun main(args: Array<String>) {
    var rd = Random
    var soNgauNhien = rd.nextInt(1, 100)
    var n = 1
    println(soNgauNhien)
    while (n <= 7) {
        println("moi ban doan so tu (1-99) lan $n :")
        var soCuaBan = readLine()!!.toInt()
        if (soCuaBan == soNgauNhien) {
            println("so cua ban bang so may = $soNgauNhien")
            println("ban co muon choi tiep khong(y/n)")
            var bien = readLine()
            if (bien == "n") {
                println("cam ơn bạn đã chơi")
                break
            } else {
                soNgauNhien = rd.nextInt(1, 100)
            }
        } else if (soCuaBan > soNgauNhien) {
            println("so ban doan lớn hơn số máy đoán!")
            n += 1
        } else if (soCuaBan < soNgauNhien) {
            println("số bạn đoán nhỏ hơn số máy đoán")
            n += 1
        }
        if(n == 8){
            println("bạn đã hết lượt chơi và bạn đã thua!")
            println("cam ơn bạn đã chơi")
        }

    }
}


