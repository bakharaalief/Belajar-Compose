package com.bakhdev.composelearning.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bakhdev.composelearning.ui.theme.ComposeLearningTheme

class TextSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        //title
                        Text(
                            text = "This is Sample Text",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFontWeightSample()
                        Spacer(modifier = Modifier.height(20.dp))
                        TextDecorationSample()
                        Spacer(modifier = Modifier.height(20.dp))
                        TextColorSample()
                        Spacer(modifier = Modifier.height(20.dp))
                        TextScrollingHorizontal()
                        Spacer(modifier = Modifier.height(20.dp))
                        TextScrollingVertical()
                    }
                }
            }
        }
    }
}

@Composable
fun TextFontWeightSample() {
    Column {
        //row 1
        Row {
            Text(
                text = "This is Bold",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Normal",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Medium",
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        //row 2
        Row {
            Text(
                text = "This is Black",
                fontWeight = FontWeight.Black,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Extra Bold",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Extra Light",
                fontWeight = FontWeight.ExtraLight,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        //row 3
        Row {
            Text(
                text = "This is Light",
                fontWeight = FontWeight.Light,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Semi Bold",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Thin",
                fontWeight = FontWeight.Thin,
                fontSize = 16.sp,
            )
        }
    }
}

@Composable
fun TextDecorationSample() {
    Column {
        //row 1
        Row {
            Text(
                text = "This is Under Line",
                textDecoration = TextDecoration.Underline,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "This is Line Through",
                textDecoration = TextDecoration.LineThrough,
                fontSize = 16.sp
            )
        }
    }
}

@Composable
fun TextColorSample() {
    Row {
        Text(text = "This is Yellow", color = Color.Yellow)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "This is Blue", color = Color.Blue)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "This is Cyan", color = Color.Cyan)
    }
}

@Composable
fun TextScrollingHorizontal() {
    LazyRow {
        items(count = 10) { index ->
            if (index % 2 == 0) Text(text = "this item number $index")
            else Text(text = "this item number $index", color = Color.Blue)

            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}

@Composable
fun TextScrollingVertical() {
    val data = listOf("aye", "uhuy", "mantappu", "jiwa")

    LazyColumn {
        data.forEach {
            item { Text(text = "This ini $it") }
        }
    }
}