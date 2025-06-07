package com.example.tom_jerry_task_compose.tom_account_functions

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.backgroundCard
import com.example.tom_jerry_task_compose.ui.theme.black
import com.example.tom_jerry_task_compose.ui.theme.creamyGreen
import com.example.tom_jerry_task_compose.ui.theme.lightRose
import com.example.tom_jerry_task_compose.ui.theme.lightSkyBlue
import com.example.tom_jerry_task_compose.ui.theme.spreateLineColor
import com.example.tom_jerry_task_compose.ui.theme.vanillaCream
import com.example.tom_jerry_task_compose.ui.theme.grayWithOpacity60

@Composable
fun TomAccountCardContent() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TomAccountCardDesign(
                icon = painterResource(R.drawable.death),
                value = "2M 12K",
                label = "No. of quarrels",
                backgroundColor = lightSkyBlue
            )
            TomAccountCardDesign(
                icon = painterResource(R.drawable.run_icon),
                value = "+500 h",
                label = "Chase time",
                backgroundColor = creamyGreen
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TomAccountCardDesign(
                icon = painterResource(R.drawable.sad_icon),
                value = "2M 12K",
                label = "Hunting times",
                backgroundColor = lightRose
            )
            TomAccountCardDesign(
                icon = painterResource(R.drawable.heartbreak),
                value = "3M 7K",
                label = "Heartbroken",
                backgroundColor = vanillaCream
            )
        }

        Text(
            text = "Tom settings",
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
            color = black,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = backgroundCard)
        ) {
            Column {
                SettingItem(
                    icon = painterResource(R.drawable.sleeping_place_icon),
                    text = "Change sleeping place"
                )
                SettingItem(
                    icon = painterResource(R.drawable.mewo),
                    text = "Meow settings"
                )
                SettingItem(
                    icon = painterResource(R.drawable.fridge),
                    text = "Password to open the fridge"
                )
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Divider(modifier = Modifier.border(width = 0.25.dp, color = spreateLineColor))
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "His favorite foods",
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
            color = black,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = backgroundCard)
        ) {
            Column {
                SettingItem(
                    icon = painterResource(R.drawable.alert_icon),
                    text = "Mouses"
                )
                SettingItem(
                    icon = painterResource(R.drawable.hamburger_icon),
                    text = "Last stolen meal"
                )
                SettingItem(
                    icon = painterResource(R.drawable.sleeping),
                    text = "Change sleep mood"
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "v.TomBeta",
            fontSize = 12.sp,
            fontWeight = FontWeight.W400,
            color = grayWithOpacity60,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
