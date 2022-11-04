package com.example.pogoda

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListName(post: String, photo: Int, comments: String, likes: Int, views: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 3.dp, vertical = 1.dp),
        shape = RoundedCornerShape(5.dp),
        backgroundColor = Color.DarkGray,
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = photo),
                contentDescription = "",
                modifier = Modifier.padding(top = 3.dp)
            )
            Text(
                modifier = Modifier.padding(top = 3.dp),
                text = post,
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Justify
            )
            Text(
                modifier = Modifier.padding(top = 3.dp), text = "Комментарии:", color = Color.Gray
            )
            Text(
                text = comments, color = Color.LightGray, textAlign = TextAlign.Justify
            )
            Row(
                modifier = Modifier
                    .padding(top = 3.dp, bottom = 3.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "$likes понравилось", color = Color.Red)
                Text(text = "$views просмотров", color = Color.Cyan)
            }
        }
    }
}