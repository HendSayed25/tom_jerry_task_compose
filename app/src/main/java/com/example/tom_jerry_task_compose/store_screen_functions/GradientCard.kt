package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R

@Preview
@Composable
fun GradientCard() {
    Row(
        modifier = Modifier
            .padding(14.dp).height(90.dp).width(358.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF03446A), Color(0xFF0685D0)
                    ),
                ), shape = RoundedCornerShape(15.dp)
            )
    ) {
        Column(
            modifier = Modifier.padding(top = 14.dp, start = 14.dp),
        ) {
            Text(
                "Buy 1 Tom and get 2 for free",
                color = White,
                fontSize = 16.sp,
                fontWeight = FontWeight.W600
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Adopt Tom! (Free Fail-Free Guarantee)",
                color = White.copy(0.9f),
                fontSize = 12.sp,
                fontWeight = FontWeight.W400
            )
        }
        Image(
            painter = painterResource(R.drawable.tom_card),
            contentDescription = "tom card",
            modifier = Modifier
                .width(135.dp)
                .height(105.dp)
                .fillMaxSize()
                .offset(y = (-11.4).dp, x= (-3.8).dp)
                .scale(1.27f)
        )
    }
}