package com.example.codapizza.ui.theme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codapizza.R
import com.example.codapizza.model.Topping
import com.example.codapizza.model.ToppingPlacement


/*PizzaBuilderScreen --- a composable that draws all of the main content inside the activity */
/*The button composable takes two required inputs: an onClick callback and a set of composable children to place inside the button.*/
@Preview
@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
    ) {
        ToppingList(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = true)
        )
        OrderButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Composable
private fun ToppingList(
    modifier: Modifier = Modifier,
) {
    LazyColumn (
        modifier = modifier
    ) {
        items(Topping.entries.toTypedArray()) { topping ->
            ToppingCell(
                topping = topping,
                placement = ToppingPlacement.Left,
                onClickTopping = { /*TODO*/
                }
            )
        }
    }
}

@Composable
private fun OrderButton(
    modifier: Modifier = Modifier,
) {
    Button(
        modifier = modifier,
        onClick = {}

    ) {
        Text(
            text = stringResource(R.string.place_order_button).toUpperCase(Locale.current)
        )
    }
}

