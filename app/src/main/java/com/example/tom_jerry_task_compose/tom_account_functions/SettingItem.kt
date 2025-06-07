package com.example.tom_jerry_task_compose.tom_account_functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.ui.theme.black
import com.example.tom_jerry_task_compose.ui.theme.white

@Composable
fun SettingItem(icon: Painter, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box (
            modifier = Modifier.size(40.dp).
            background(white, shape = RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center){
            Icon(
                painter = icon,
                contentDescription = null,
                tint = black,
                modifier = Modifier
                    .size(24.dp)
                    .background(white)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            color = black,
            fontSize = 16.sp,
            fontWeight = FontWeight.W500
        )
    }
}