package com.example.lab2_ph34649

//Bài 3: Viết chương trình kiểm tra 1 năm bất kỳ có phải năm nhuần hay không
//(Năm nhuần là năm chia hết cho 4 nhưng không chia hết cho 100 hoặc chia hết
//cho 400). Chương trình bắt buộc phải nhập năm >=0, nếu nhập sai bắt nhập lại
//cho tới khi nào nhập đúng, kết thúc chương trình cho phép người dùng lựa chọn
//tiếp tục hay không?

fun main() {

    setdowhile()

}

fun setdowhile(){
    do {
        println("Nhập số năm để tính xem có phải năm nhuận không :")
        var a = readLine()?.toIntOrNull() ?: 0
        xetnamnhuan(a)
    } while (a != null && a <= 0)

}
fun xetnamnhuan(a: Int) {
    if (a != null && a > 0) {
        xetdungsai(a)
        xemcotieptuchaykhong(a)
    }

}
fun xetdungsai(a: Int) {
    if (a != 0 && a.rem(4) == 0 && a.rem(400) == 0 || a.rem(100) != 0) {
        println("Năm $a chính là năm nhuận")
    } else {
        println("Năm $a không phải năm nhuận")
    }
}
fun xemcotieptuchaykhong(a: Int) {
println("Ban hay chon muon tiep tuc hay khong :")
    var chon = readLine()
    var choose = when(chon) {
        "co" -> setdowhile()
        "khong" -> "kêt thúc trương trình"
        else -> "kết thúc trương trình "
    }
    println(choose)
}