package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.lightGray
import com.example.tom_jerry_task_compose.ui.theme.white

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier
            .width(300.dp)
            .height(52.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Search about tom ...", fontSize = 14.sp) },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.search_normal),
                    contentDescription = "search icon",
                    tint = lightGray
                )
            },
            modifier = Modifier
                .weight(1f)
                .padding(start = 15.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(
                disabledTextColor = lightGray,
                focusedContainerColor = lightGray,
                unfocusedContainerColor = white,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
        )
    }
}