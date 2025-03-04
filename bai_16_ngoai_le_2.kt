fun Thuong(a:Int,b:Int):Int{
    if(b == 0){
        throw Exception("mau bang khong khong chia duoc")

    }
    return a/b
}
fun main(args: Array<String>) {
    try {

        println("${Thuong(5,2)}")
    }
    catch (e:Exception){
        println(e.message)
    }
    finally{
        println("da dang suat khoi co so du lieu")
    }

    println("doan code sau")
}