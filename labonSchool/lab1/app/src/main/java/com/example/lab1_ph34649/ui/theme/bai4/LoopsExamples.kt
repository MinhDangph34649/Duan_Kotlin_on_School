package com.example.lab1_ph34649.ui.theme.bai4

fun main() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
        /*Yummy, it's a carrot cake!
          Yummy, it's a cheese cake!
          Yummy, it's a chocolate cake!*/
    }
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten ++
    }

    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")