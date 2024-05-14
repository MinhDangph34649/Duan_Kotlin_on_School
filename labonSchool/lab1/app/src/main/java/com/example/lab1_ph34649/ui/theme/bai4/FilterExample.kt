package com.example.lab1_ph34649.ui.theme.bai4

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // Số lớn hơn 0

    val negatives = numbers.filter { it < 0 }      // Số nhỏ hơn 0

    println("Số: $numbers")
    println("Số Dương: $positives")
    println("Số Âm: $negatives")
}