import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println("nhap vap ngay thang nam(dd/MM/yyyy): ")
    var s = readLine()
    if(s == null) return
    var dateInput = dinhDang.parse(s)
    var timeNamSinh = Calendar.getInstance()
    timeNamSinh.time = dateInput
    var namSinh = timeNamSinh.get(Calendar.YEAR)
    var thangSinh = timeNamSinh.get(Calendar.MONTH)
    var ngaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam sinh(dd/MM/yyyy): $ngaySinh/${thangSinh + 1}/$namSinh")
    var thoiGianThuc = Calendar.getInstance()
    var nam = thoiGianThuc.get(Calendar.YEAR)
    println("nam nay ban ${nam-namSinh}")

}