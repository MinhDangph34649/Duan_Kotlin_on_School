package com.example.buoi3_ph34649.BTOOP.bai7

open class NguoiModel(var hoten: String, var tuoi: Int?, var quequan: String?) {
    open fun getThongTin(): String {
        return "$hoten - tuoi: $tuoi - que: $quequan"
    }
}
