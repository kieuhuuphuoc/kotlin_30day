import kotlin.random.Random

fun main(args: Array<String>) {
    var rd = Random
    var rd2 = rd.nextInt(10)

    // random trong doan


    var rd3 = rd.nextDouble(0.0, 1.0)
    println(rd3)

    var rd4 = rd3 + rd2
}