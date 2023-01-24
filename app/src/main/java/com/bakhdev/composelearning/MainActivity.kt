package com.bakhdev.composelearning

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bakhdev.composelearning.sample.ButtonSampleActivity
import com.bakhdev.composelearning.sample.TextSampleActivity
import com.bakhdev.composelearning.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        //text compose
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, TextSampleActivity::class.java)
                            startActivity(intent)
                        }) {
                            Text(text = "Text Compose")
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        //text compose
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, ButtonSampleActivity::class.java)
                            startActivity(intent)
                        }) {
                            Text(text = "Button Compose")
                        }
                    }
                }
            }
        }
    }
}

@Preview(name = "lightMode", showBackground = true)
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun Preview() {
    ComposeLearningTheme {
        Surface(
            color = MaterialTheme.colors.background
        ) {
        }
    }
}