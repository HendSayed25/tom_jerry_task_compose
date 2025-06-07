package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.darkBlue


@Composable
fun ShowMoreSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = "Cheap Tom Section",
            fontWeight = FontWeight.W600,
            fontSize = 20.sp
        )

        // Spacer to push the View All to the end
        androidx.compose.foundation.layout.Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "View all",
            fontSize = 12.sp,
            fontWeight = FontWeight.W500,
            color = darkBlue
        )

        Image(
            painter = painterResource(R.drawable.arrow_right_icon),
            contentDescription = "arrow right to show more",
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}
