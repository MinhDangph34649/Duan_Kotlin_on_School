package com.example.buoi3_ph34649.BTOOP.bai8

class SinhVien(var hoTen: String, var tuoi: Int?, var lop: String) {
    fun getThongTin(): String {
        return "$hoTen - tuoi: $tuoi - lop: $lop"
    }
}
