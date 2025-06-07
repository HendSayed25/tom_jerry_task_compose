package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.black
import com.example.tom_jerry_task_compose.ui.theme.lightGray

@Composable
fun TopBar() {
    Row(modifier = Modifier.padding(15.dp)) {
        Image(
            painter = painterResource(R.drawable.profile_image),
            contentDescription = "profile image",
            Modifier.size(48.dp).padding(top=8.dp)
        )
        Column(modifier = Modifier
            .padding(start = 5.dp, top = 5.dp)
            .weight(1f)) {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                color = black,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 5.dp, start = 5.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Which Tom do you want to buy?",
                color = lightGray,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 1.dp, start = 5.dp)
            )
        }

        NotificationIconCard()
    }
}