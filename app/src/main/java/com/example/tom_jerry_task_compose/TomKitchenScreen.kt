import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry_task_compose.R
import com.example.tom_jerry_task_compose.ui.theme.bannerBackground
import com.example.tom_jerry_task_compose.ui.theme.darkBlue
import com.example.tom_jerry_task_compose.ui.theme.grayWithOpacity37
import com.example.tom_jerry_task_compose.ui.theme.grayWithOpacity60
import com.example.tom_jerry_task_compose.ui.theme.lightGray
import com.example.tom_jerry_task_compose.ui.theme.lightSkyBlue
import com.example.tom_jerry_task_compose.ui.theme.midnightBlue
import com.example.tom_jerry_task_compose.ui.theme.preparationItemBorderColor
import com.example.tom_jerry_task_compose.ui.theme.white

@Preview
@Composable
fun TomKitchenScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState)
            .fillMaxSize()
            .background(Color(0xFFF2F9FC)).padding(top=50.dp)
    ) {
        // Image Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(
                    color = bannerBackground
                ),
        ) {
            Box(
                Modifier.padding(top = 20.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.ellipse),
                    contentDescription = "background",
                    //Modifer.offset(x=15.dp,y=(15).dp)
                     modifier = Modifier.scale(2f).padding(top=30.dp)
                )
            }

            Box {
                Column(
                    modifier = Modifier.padding(top = 30.dp, start = 15.dp)
                ) {
                    IconWithText(R.drawable.ruler, "High tension")
                    Spacer(Modifier.height(15.dp))
                    IconWithText(R.drawable.shock_food, "Shocking foods")
                }
            }
        }

        // Main Card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEEF4F6), shape = RoundedCornerShape(50.dp))
                .offset(y = (-8).dp),

        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.spagetti),
                    contentDescription = null,
                    modifier = Modifier
                        .size(190.dp)
                        .offset(x = (170).dp, y = (-150).dp)
                )
            }
            Column(modifier = Modifier.padding(top=40.dp, start = 20.dp, end = 20.dp)) {

                // Title and Favorite Icon
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column {
                        Text(
                            text = "Electric Tom pasta",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xDE1F1F1E)

                        )
                        Spacer(Modifier.height(20.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Card(
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(37.dp),
                                shape = RoundedCornerShape(12.dp),
                                colors = CardDefaults.cardColors(containerColor = lightSkyBlue )
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
                                            painter = painterResource(R.drawable.money_bag_icon),
                                            contentDescription = null,
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "5 cheeses",
                                            color = darkBlue,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }
                                }
                            }

                        }
                    }

                    Icon(
                        painter = painterResource(R.drawable.heart),
                        contentDescription = "heart",
                        tint = darkBlue,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                // Description
                Text(
                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                    fontSize = 14.sp,
                    color = Color(0x99121212),
                    fontWeight = FontWeight.W500
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Details Section
                Text(
                    text = "Details",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color(0xDE1F1F1E)

                )

                Spacer(modifier = Modifier.height(14.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    DetailCard("1000 V", "Temperature", painterResource(R.drawable.temprature))
                    DetailCard("3 sparks", "Time", painterResource(R.drawable.spark))
                    DetailCard("1M 12K", "No. of deaths", painterResource(R.drawable.death_right))
                }

                Spacer(modifier = Modifier.height(30.dp))

                // Preparation Steps
                Text(
                    text = "Preparation method",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color =Color(0xDE1F1F1E),
                    modifier = Modifier.padding(start = 12.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                val steps = listOf(
                    "Put the pasta in a toaster.",
                    "Pour battery juice over it.",
                    "Wait for the spark to ignite.",
                    "Serve with an insulating glove."
                )

                steps.forEachIndexed { index, step ->
                    PreparationStep(index + 1, step)
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Add to cart
                AddToCartFooter()
                Spacer(Modifier.height(35.dp))
            }
        }
    }
}

@Composable
fun IconWithText(iconRes: Int, label: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = label,
            tint = white,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = label, fontSize = 16.sp, color = white)
    }
}

@Composable
fun DetailCard(value: String, label: String,icon:Painter) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xFFE0F2F7), shape = RoundedCornerShape(12.dp))
            .padding(12.dp)
            .width(89.dp)
            .height(90.dp)
    ) {
        Image(painter = icon, contentDescription = "icon")
        Spacer(Modifier.height(12.dp))
        Text(text = value, fontWeight = FontWeight.Bold, color = grayWithOpacity60)
        Spacer(Modifier.height(5.dp))
        Text(text = label, fontSize = 12.sp, color = grayWithOpacity37)
    }
}


@Composable
fun PreparationStep(number: Int, text: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .background(Color.White, shape = RoundedCornerShape(12.dp))
    ) {
        Box(
            modifier = Modifier
                .size(37.dp)
                .align(Alignment.TopStart)
                .offset(x = (-5).dp, y = (-3).dp)
                .border(1.dp, color = preparationItemBorderColor, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number.toString(),
                color = Color(0xFF035587),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
               // .fillMaxWidth()
                .padding(start = 40.dp)
        ) {
            Text(
                text = text,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color(0x99121212),
              //  modifier = Modifier.align(Alignment.CenterVertically)

            )
        }
    }
}


@Composable
fun AddToCartFooter() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        contentAlignment = Alignment.Center

    ) {
        Button(
            onClick = { /* TODO: Action */ },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976A5)),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
               // horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Add to cart",
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 50.dp)
                )
               // Box(Modifier.background(shape = CircleShape,))
                Spacer(Modifier.width(35.dp))
                Column  {
                    Text(
                        text = "3 cheeses",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight =FontWeight.W500
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "5 cheeses",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.White.copy(alpha = 0.7f),
                            textDecoration = TextDecoration.LineThrough
                        )
                    )
                }
            }
        }
    }
}

