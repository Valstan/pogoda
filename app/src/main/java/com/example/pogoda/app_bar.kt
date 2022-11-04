package com.example.pogoda

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun AppBar() {
    Row(
        modifier = Modifier
            .background(Color.Blue)
            .horizontalScroll(state = rememberScrollState(), enabled = true)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = " Лента", color = Color.Yellow, fontSize = 25.sp)
        Text(text = " Малмыж ", color = Color.White, fontSize = 25.sp)
        Text(text = " Объявления ", color = Color.Cyan, fontSize = 25.sp)
        Text(text = " Кругозор ", color = Color.Magenta, fontSize = 25.sp)
        Text(text = " ЧАТ ", color = Color.Yellow, fontSize = 25.sp)
        Text(text = " ТАКСИ ", color = Color.Yellow, fontSize = 25.sp)
    }
}