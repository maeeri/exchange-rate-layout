package com.emo.tehtava_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.emo.tehtava_1.first_layout.ConverterView
import com.emo.tehtava_1.ui.theme.Tehtava_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tehtava_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ConverterView(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

