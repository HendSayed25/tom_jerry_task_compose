package com.example.tom_jerry_task_compose.tom_account_functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.white
import com.example.tom_jerry_task_compose.ui.theme.whiteWithOpacity12
import com.example.tom_jerry_task_compose.ui.theme.whiteWithOpacity80

@Composable
fun BackGroundBanner() {
    Box(
        modifier = Modifier.height(230.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.background_banner),
            contentDescription = "background container",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.banner),
                    contentDescription = "banner image",
                    modifier = Modifier.size(64.dp)

                )

                Text(
                    text = "Tom",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                    color = white,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Text(
                    text = "specializes in failure!",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = whiteWithOpacity80,
                    modifier = Modifier.padding(top = 3.dp)
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(
                            top = 6.dp, bottom = 8.dp, start = 12.dp, end = 12.dp
                        )
                        .height(27.dp)
                        .width(105.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = whiteWithOpacity12
                    ),
                    contentPadding = PaddingValues(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 12.dp,
                        end = 12.dp
                    )
                ) {
                    Text(
                        text = "Edit foolishness",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W500,
                        color = white
                    )
                }
            }
        }
    }
}