package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.darkBlue
import com.example.tom_jerry_task_compose.ui.theme.white

@Composable
fun FilterIcon() {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = darkBlue),
        modifier = Modifier.size(49.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.filter_horizontal_icon),
                contentDescription = "notification icon",
                modifier = Modifier.size(24.dp),
                tint = white
            )
        }
    }

}