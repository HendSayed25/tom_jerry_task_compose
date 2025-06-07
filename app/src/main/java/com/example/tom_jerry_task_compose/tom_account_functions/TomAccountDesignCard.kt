package com.example.tom_jerry_task_compose.tom_account_functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.ui.theme.grayWithOpacity60
import com.example.tom_jerry_task_compose.ui.theme.grayWithOpacity37

@Composable
fun TomAccountCardDesign(
    icon: Painter,
    value: String,
    label: String,
    backgroundColor: Color
) {
    Card(
        modifier = Modifier
            .width(165.dp)
            .height(56.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = icon,
                    contentDescription = null,
                )
            }
           Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = value,
                    color = grayWithOpacity60,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600
                )
                Text(
                    text = label,
                    color = grayWithOpacity37,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W500
                )
            }
        }
    }
}