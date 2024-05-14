package com.example.lab1_ph34649.ui.theme.bai4

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val totalCount = numbers.count()                     // Tổng số phần tử: 6
    val evenCount = numbers.count { it % 2 == 0 }        // Số phần tử chẵn: 3

    println("Tổng số phần tử: $totalCount")
    println("Số phần tử chẵn: $evenCount")
}