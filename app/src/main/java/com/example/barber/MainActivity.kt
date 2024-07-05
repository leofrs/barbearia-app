package com.example.barber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.barber.ui.theme.BarberTheme
import com.example.barber.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BarberTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = androidx.compose.ui.graphics.Color.Blue)
                        .windowInsetsPadding(WindowInsets.statusBars),

                ) { innerPadding ->
                    AppNavHost(
                        modifier = Modifier.padding(innerPadding),
                        navController = rememberNavController()
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = androidx.compose.ui.graphics.Color.Blue)
            .windowInsetsPadding(WindowInsets.statusBars),

        ) { innerPadding ->
        AppNavHost(
            modifier = Modifier.padding(innerPadding),
            navController = rememberNavController()
        )
    }
}
