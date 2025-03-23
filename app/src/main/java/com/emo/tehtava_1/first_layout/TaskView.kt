package com.emo.tehtava_1.first_layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emo.tehtava_1.ui.theme.Tehtava_1Theme


@Composable
fun ConverterView(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (modifier = Modifier
            .weight(1f)
        ) {
        }
        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CenterPiece(modifier = Modifier)
        }
        Row (modifier = Modifier
            .weight(1f)
        ) {
        }
    }
}

@Composable
fun CenterPiece(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    var currencyInput by remember { mutableStateOf("") }
    val resultText by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Row (
            modifier = Modifier
        ) {
            TextField(
                modifier = Modifier.width(configuration.screenWidthDp.dp),
                value = currencyInput,
                onValueChange = { currencyInput = it },
                label = { Text("") }
            )
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SelectionRow(modifier)
        }
        Row (
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(modifier = Modifier, text = resultText, fontSize = 35.sp)
        }
    }
}

@Composable
fun SelectionRow(modifier: Modifier = Modifier) {
    val currencyFrom by remember { mutableStateOf("EUR") }
    val currencyTo by remember { mutableStateOf("USD") }
    Column (modifier = Modifier) {
        Text(modifier = Modifier, text = currencyFrom)
    }
    Column (modifier = Modifier) {
        IconButton(
            onClick = { mockOnClick() },
            enabled = true,
            modifier = Modifier,
            content = { Icon(Icons.Rounded.Refresh,
                contentDescription = "Refresh") }
        )
    }
    Column (modifier = Modifier) {
        Text(modifier = Modifier, text = currencyTo)
    }
}

fun mockOnClick() {
    return Unit
}

@Preview
@Composable
fun LayoutPreview()
{
    Tehtava_1Theme {
        ConverterView()
    }
}