package com.dexmp.learning1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

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

    val num_posts = intArrayOf(1200, 434, 123133)
    val what_is = arrayOf("Posts", "Followers", "Views")
    val tg_stat = arrayOf("Telegram", "@DexMP", "https://t.me/DexMP_blog")

    Box(
        modifier = Modifier
            .padding(all = 24.dp)
            .fillMaxWidth()
            .background(color = Color.White)
            .border(width = 1.dp, color = Color.Gray)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)
            ) {
                for(i in 0 until 3) {
                    Box(
                        modifier = Modifier
                            .weight(1f),
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            modifier = Modifier
                                .padding(all = 8.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "${num_posts[i]}", fontSize = 24.sp)
                            Text(text = what_is[i], fontSize = 11.sp)
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(start = 24.dp, bottom = 12.dp)
            ) {
                for(i in 0 until 3) {
                    if (i == 0){
                        Box() {
                            Text(tg_stat[i], fontSize = 24.sp)
                        }
                    } else {
                        Text(tg_stat[i])
                    }
                }
            }
        }
    }

}