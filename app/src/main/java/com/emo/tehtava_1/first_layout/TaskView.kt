package com.emo.tehtava_1.first_layout

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.sharp.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emo.tehtava_1.ui.theme.Tehtava_1Theme


@Composable
fun ConverterView(modifier: Modifier = Modifier) {


    Scaffold {paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
            .background(Color.Cyan)
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

}

@Composable
fun CenterPiece(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    var text by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("0") }
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Row (
            modifier = Modifier.background(Color.Red)
        ) {
            TextField(
                modifier = Modifier.width(configuration.screenWidthDp.dp),
                value = text,
                onValueChange = { text = it },
                label = { Text("") }
            )
        }
        Row (
            modifier = Modifier
        ) {
            Icon(
                Icons.Rounded.Refresh,
                contentDescription = "Refresh"
            )
        }
        Row (
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(modifier = Modifier, text =resultText, fontSize = 30.sp)
        }
    }


}

@Preview
@Composable
fun LayoutPreview()
{
    Tehtava_1Theme {
        ConverterView()
    }
}