package com.example.baitapbuoi4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.baitapbuoi4.ui.theme.BaitapBuoi4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCard("Nguyễn Minh Đăng - ph34649")
        }
    }
}

@Composable
fun GreetingCard(msg: String) {
    var text by remember { mutableStateOf(msg) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MessageCard(msg = text)
        Button(onClick = { text = "Hi!" }) {
            Text("Say Hi!")
        }
    }
}

@Composable
fun MessageCard(msg: String) {
    Text(
        text = msg,
        modifier = Modifier
            .padding(0.dp, 16.dp)
            .fillMaxWidth(),
        color = Color.DarkGray,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
    GreetingCard("Nguyễn Văn A - PS23456")
}

@Preview
@Composable
fun GetLayout(title: String = "Trang Chu") {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        getTextTitle(title = title)
        Button(onClick = {
            /*TODO*/
        }) {
            Text(text = "Click Me")
        }
    }
}

@Composable
fun getTextTitle(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        fontSize = 30.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello, $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BaitapBuoi4Theme {
        Greeting("Android")
    }
}
