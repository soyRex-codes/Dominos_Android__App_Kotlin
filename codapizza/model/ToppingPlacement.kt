package com.example.codapizza.model

import androidx.annotation.StringRes
import com.example.codapizza.R

enum class ToppingPlacement( /*Specify topping locations (ToppingPlacement.kt) */
    @StringRes val label: Int /* @StringRes is not required. But it helps Android Lint verify at compile time that constructor calls provide a valid string resource ID. */
) {
    Left(R.string.placement_left), Right(R.string.placement_right), All(R.string.placement_all)
}
//new package called model to store the model classes you will use to define and represent a pizza
/*new file in this package called ToppingPlacement.kt and define an enum to specify which part of a pizza a topping is present on.
If a topping is not present on the pizza, you can represent that with a null value instead. */