package com.example.lab2_ph34649

fun main() {

    var sv = SinhVien()
    println("Bạn vui lòng nhập số tuổi của bạn : ")
    sv.Namsinh = readLine()?.toIntOrNull() ?: 0
    println(sv.tinhtuoiXem())

}