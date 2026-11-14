package com.dexmp.learning1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VisitCard()
        }
    }
}

@Preview
@Composable
fun VisitCard() {

    val num_posts = 1232

    Box(
        modifier = Modifier
            .padding(all = 24.dp)
            .fillMaxWidth()
            .background(color = Color.White)
            .border(width = 1.dp, color = Color.Gray)
    ){
        Column(
            modifier = Modifier
                .padding(all = 8.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                for(i in 0 until 3) {
                    Box(){
                        Column() {
                            Text(text = "$num_posts")
                        }
                    }
                }
            }
            Text(text = "Telegram")
            Text(text = "@DexMP")
            Text(text = "https://t.me/DexMP_blog")
        }
    }

}