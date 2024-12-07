package com.example.a17_1_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.a17_1_jetpackcompose.ui.theme._17_1_JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudentName(name = "Дмитрий")
        }
    }
}

@Composable
fun StudentName(name: String) {
    Text(
        text = "Студент университета Urban: $name",
        fontSize = 16.sp,
        color = Color.Red
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
    _17_1_JetpackComposeTheme {
        StudentName("Дмитрий")
    }
}