package com.example.lab1_ph34649


fun main (){
    println("Nhập số a :")
    var abrs = readLine();
    var a = abrs?.toDoubleOrNull()
    println("Nhập số b :")
    var bbrs = readLine();
    var b = bbrs?.toDoubleOrNull()
    if(a != null  && b != null){
    println("Tổng :" + a.plus(b))
    println("Hiệu :" + a.minus(b))
    println("Tích :" + a.times(b))
    println("Thương :"+ a.div(b))
    }

}