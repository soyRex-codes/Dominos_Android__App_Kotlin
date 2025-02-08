package com.example.codapizza.ui.theme
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codapizza.model.Topping
import com.example.codapizza.model.ToppingPlacement

//@Composable annotation. When a function is annotated with @composable, it becomes a composable function.
/*Composable functions can call other composable functions and can add elements onscreen when invoked.
Composable functions can also call regular functions, but regular functions cannot call a composable function. setContent.
Recommend that composable functions start with a capital letter.
 */
@Composable //Composable are functions
fun ToppingCell(topping: Topping, placement: ToppingPlacement?, modifier: Modifier=Modifier, onClickTopping: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            //.background(Color.Cyan)
            .clickable { onClickTopping() }
            .padding(vertical = 4.dp, horizontal = 16.dp)) {
        Checkbox(
            checked = (placement != null),
            onCheckedChange = { /*To DO */ } // Now using the callback properly
        )

        Column (
            modifier = Modifier
                .weight(1f, fill = true)
                .padding(start = 4.dp)) {
            Text(text = stringResource(topping.toppingName),
                style = MaterialTheme.typography.bodyLarge)
            // Turn a string resource "pineapple" into a string object you could show onscreen.

            if (placement != null) {
                Text(
                    text = stringResource(placement.label),
                    style = MaterialTheme.typography.bodyMedium
                )
                // If statement to check: null indicates the topping is not on the pizza.
                }
            }
        }
    }


@Preview
@Composable
private fun ToppingCellPreview() {
    ToppingCell(
        topping = Topping.Pepperoni,
        placement = ToppingPlacement.Left,
        onClickTopping = {}
    )
}
//many version of compostable
@Preview
@Composable
private fun ToppingCellPreviewNotOnPizza() {
    ToppingCell(
        topping = Topping.Pepperoni,
        placement = null,
        onClickTopping = {}
    )
}

@Preview
@Composable
private fun ToppingCellPreviewOnLeftHalf() {
    ToppingCell(
        topping = Topping.Pepperoni,
        placement = ToppingPlacement.Left,
        onClickTopping = {}
    )
}
