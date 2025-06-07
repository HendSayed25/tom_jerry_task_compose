package com.example.tom_jerry_task_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tom_jerry_task_compose.helper.TomItem
import com.example.tom_jerry_task_compose.store_screen_functions.*
import com.example.tom_jerry_task_compose.ui.theme.white

val tomList = listOf(
    TomItem(R.drawable.tom1, "Sport Tom", "He runs 1 meter ... trips over his boot.", 53),
    TomItem(R.drawable.tom2, "Smart Tom", "He invents a robot to chase Jerry.", 21),
    TomItem(R.drawable.tom3, "Cool Tom", "He rides a skateboard indoors.", 34),
    TomItem(R.drawable.tom4, "Spy Tom", "Disguises itself as a table.", 12),
    TomItem(R.drawable.tom5, "Frozen Tom", "He was chasing Jerry, he froze after the first look.", 10),
    TomItem(R.drawable.tom6, "Sleeping Tom", "He doesn't chase anyone, he just snores in stereo.", 10)
)

@Preview
@Composable
fun TomStoreScreen() {
    val rows = (tomList.size + 1) / 2
    val gridHeight = (rows * 270).dp

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(white.copy(0.15f))
            .padding(start = 20.dp, end = 20.dp, top = 25.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item { TopBar() }

        item {
            Row {
                SearchBar()
                Spacer(Modifier.width(10.dp))
                FilterIcon()
            }
        }

        item {
            Spacer(Modifier.height(5.dp))
            GradientCard()
        }

        item {
            Spacer(Modifier.height(5.dp))
            ShowMoreSection()
        }

        item {
            Spacer(Modifier.height(10.dp))
        }

        item {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(gridHeight),
                contentPadding = PaddingValues(top = 15.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                userScrollEnabled = false
            ) {
                items(tomList) { item ->
                    StoreTomCard(
                        modifier = Modifier,
                        imageId = item.imageId,
                        title = item.title,
                        description = item.description,
                        numberOfCheese = item.numberOfCheese
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
