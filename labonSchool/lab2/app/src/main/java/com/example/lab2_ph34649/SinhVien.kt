package com.example.lab2_ph34649


class SinhVien {
   private var age : Int = 0
    var namnay = 2024
    var Namsinh : Int
        get() {return age}
        set(value) {age = value}

    private fun Tinhtuoi(): Int{
        var tuoi = namnay - age
        return tuoi
    }

fun tinhtuoiXem(){
    if (Tinhtuoi()>=18){
        println("Bạn năm nay $age")
        println("Bạn năm nay đã đủ tuổi")

    }else{
        println("Bạn năm nay : $age")
        println("Bạn năm nay chưa đủ tuổi ")
    }
}

}

