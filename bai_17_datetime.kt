import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    println(cal)
    // get ngay thang nam
    var nam = cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH)
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("$ngay / $thang / $nam")

    // dat ngay thang nam theo y muon
    cal.set(Calendar.YEAR,2005)
    cal.set(Calendar.MONTH,1)
    cal.set(Calendar.DAY_OF_MONTH,14)

    var namsinh = cal.get(Calendar.YEAR)
    var thangsinh = cal.get(Calendar.MONTH)
    var ngaysinh = cal.get(Calendar.DAY_OF_MONTH)
    println("$ngaysinh / $thangsinh / $namsinh")

    // ngay gio
    var date = cal.time
    // khai bao bien
    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println(dinhDang.format(date))
    var dinhDang2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
    println(dinhDang2.format(date))
}