package com.example.tom_jerry_task_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.*
import com.example.tom_jerry_task_compose.tom_account_functions.BackGroundBanner
import com.example.tom_jerry_task_compose.tom_account_functions.TomAccountCardContent
import com.example.tom_jerry_task_compose.ui.theme.backgroundCard

@Composable
@Preview(showSystemUi = true)
fun TomAccountScreen(){
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(scrollState)
    ) {
        BackGroundBanner()

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .offset(y = (-15).dp)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .background(backgroundCard)
        ) {
            TomAccountCardContent()
        }
    }
}









