package com.example.tom_jerry_task_compose

import TomKitchenScreen
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.tom_jerry_task_compose.ui.theme.Tom_jerry_task_composeTheme


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tom_jerry_task_composeTheme{
                Scaffold {
                   // TomStoreScreen()
                   // TomAccountScreen()
                    TomKitchenScreen()
                }
            }


        }
    }
}

