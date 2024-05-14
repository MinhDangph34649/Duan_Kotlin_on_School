package com.example.lab1_ph34649.ui.theme.bai4

import kotlin.math.abs

fun main() {

    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // [5, 4, 2, 1, 3, -10]
    val natural = shuffled.sorted()                             // [-10, 1, 2, 3, 4, 5]
    val inverted = shuffled.sortedBy { -it }                    // [5, 4, 3, 2, 1, -10]
    val descending = shuffled.sortedDescending()                // [5, 4, 3, 2, 1, -10]
    val descendingBy = shuffled.sortedByDescending { abs(it)  } // [-10, 5, 4, 3, 2, 1]

    println("Shuffled: $shuffled")
    println("Natural order: $natural")
    println("Inverted natural order: $inverted")
    println("Inverted natural order value: $descending")
    println("Inverted natural order of absolute values: $descendingBy")
}