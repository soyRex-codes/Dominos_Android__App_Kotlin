package com.example.codapizza.model
import  androidx.annotation.StringRes
import com.example.codapizza.R
/*Define another enum to specify all the toppings that a customer can add to their pizza. Place enum in a new file called Topping.kt in the model package. */

enum class Topping(
    @StringRes val toppingName: Int
) {
    Basil(
        toppingName = R.string.topping_basil
    ),
    Mushroom(
        toppingName = R.string.topping_mushroom
    ),
    Olive(
        toppingName = R.string.topping_olives
    ),
    Peppers(
        toppingName = R.string.topping_peppers
    ),
    Pepperoni(
        toppingName = R.string.topping_pepperoni
    ),
    Pineapple(
        toppingName = R.string.topping_pineapple
    )

}