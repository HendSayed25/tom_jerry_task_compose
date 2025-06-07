package com.example.tom_jerry_task_compose.store_screen_functions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.darkBlue
import com.example.tom_jerry_task_compose.ui.theme.white

@Composable
fun StoreTomCard(
    modifier: Modifier,
    imageId: Int,
    title: String,
    description: String,
    numberOfCheese: Int
) {
    Box(
        modifier = modifier
            .width(250.dp)
            .padding(4.dp)
            .heightIn(min = 230.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Card(
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(width = 1.dp, color = white),
            colors = CardDefaults.cardColors(containerColor = White),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(top = 100.dp, start = 12.dp, end = 10.dp, bottom = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(Modifier.height(25.dp)) {
                    Text(
                        text = title,
                        fontWeight = FontWeight.W600,
                        fontSize = 18.sp,
                        color = Color.Black,
                        maxLines = 2,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                }
                Text(
                    text = description,
                    fontWeight = FontWeight.W400,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                AddToCardSection(numberOfCheese)
            }
        }

        Image(
            painter = painterResource(id = imageId),
            contentDescription = "image id",
            modifier = Modifier
                .width(95.dp)
                .height(100.dp)
                .offset(y = (-20).dp)
        )
    }
}

@Composable
fun AddToCardSection(numberOfCheese: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(color = Color(0xFFE0F2F7), shape = RoundedCornerShape(10.dp))
                .padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.money_bag_icon),
                contentDescription = "Cheese icon",
                tint = darkBlue,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "$numberOfCheese cheeses",
                color = darkBlue,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp
            )
        }
        Spacer(Modifier.width(3.dp))
        Box(
            modifier = Modifier
                .size(30.dp)
                .border(BorderStroke(0.5.dp, color = darkBlue), shape = RoundedCornerShape(12.dp))
        ) {
            Icon(
                painter = painterResource(R.drawable.card),
                contentDescription = "Add to cart",
                tint = darkBlue,
                modifier = Modifier
                    .size(14.dp)
                    .align(Alignment.Center)
            )
        }
    }
}
