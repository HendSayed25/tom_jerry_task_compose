package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.darkBlue
import com.example.tom_jerry_task_compose.ui.theme.lightGray
import com.example.tom_jerry_task_compose.ui.theme.white

@Composable
fun NotificationIconCard() {
    Box(modifier = Modifier.size(40.dp)) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .size(30.dp)
                .border(
                    BorderStroke(width = 1.dp, color = lightGray),
                    shape = RoundedCornerShape(12.dp)
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.notification_icon),
                contentDescription = "notification icon",
                modifier = Modifier.size(24.dp),

                )
        }

        Badge(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(x = (1).dp, y = (-4).dp),
            containerColor = darkBlue
        ) {
            Text(
                text = "3",
                color = white,
                fontSize = 10.sp,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center
            )
        }
    }
}