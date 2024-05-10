package com.example.lab2_ph34649

//Bài 2: Nhập vào một tháng bất kỳ, hỏi tháng này thuộc quý mấy trong năm. Biết
//rằng tháng 1, 2, 3 là quý 1; tháng 4, 5, 6 là quý 2; tháng 7, 8, 9 là quý 3; tháng 10,
//11, 12 là quý 4


fun main (){
    println("Nhập tháng : ")
    var thang = readLine()?.toIntOrNull()?:0

    var c = when(thang){
        1 -> "đây là tháng số $thang thuộc quý 1 trong năm "
        2 -> "đây là tháng số $thang thuộc quý 1 trong năm "
        3 -> "đây là tháng số $thang thuộc quý 1 trong năm "
        4 -> "đây là tháng số $thang thuộc quý 2 trong năm "
        5 -> "đây là tháng số $thang thuộc quý 2 trong năm "
        6 -> "đây là tháng số $thang thuộc quý 2 trong năm "
        7 -> "đây là tháng số $thang thuộc quý 3 trong năm "
        8 -> "đây là tháng số $thang thuộc quý 3 trong năm "
        9 -> "đây là tháng số $thang thuộc quý 3 trong năm "
        10 -> "đây là tháng số $thang thuộc quý 4 trong năm "
        11 -> "đây là tháng số $thang thuộc quý 4 trong năm "
        12 -> "đây là tháng số $thang thuộc quý 4 trong năm "
        else -> "Bạn vừa nhập tháng $thang không hợp lệ !!!"

    }
    println(c)
}