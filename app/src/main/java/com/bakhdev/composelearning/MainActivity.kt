package com.bakhdev.composelearning

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Column {
                        ColumnView(name = "Android")
                        RowView(name = "Android")
                        CardView()
                        ListCardView()
                    }
                }
            }
        }
    }
}

@Composable
fun ColumnView(name: String) {
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(text = "Hello $name Satu!")
        Text(text = "Hello $name Dua!")
    }
}

@Composable
fun RowView(name: String) {
    Row(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(text = "Hello $name Satu!")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Hello $name Dua!")
    }
}

@Composable
fun CardView() {
    Card(
        modifier = Modifier
            .height(IntrinsicSize.Max)
            .padding(10.dp),
        backgroundColor = MaterialTheme.colors.primary,
        elevation = 5.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .clip(CircleShape)
                    .height(80.dp)
                    .width(80.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Hello ini Testing Bikin Card!",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "lorem ipsum bla bla bla!",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun ListCardView(){
    LazyColumn{
        for(i in 1..10){
            item { CardView() }
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
            CardView()
        }
    }
}