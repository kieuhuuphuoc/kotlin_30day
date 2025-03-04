fun main(args: Array<String>) {
    var a = 10
    var b = 2
    try {
        var c = a/b
        println(c)
    }
    catch (e: Exception) {
        e.printStackTrace()
    }
    finally {
        println("thoat khoi database")
    }
    println("doan code sau")
}