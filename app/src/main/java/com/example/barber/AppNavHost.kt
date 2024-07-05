package com.example.barber

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.barber.views.HomeView
import com.example.barber.views.LoginView
import com.example.barber.views.RegisterView

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = Screens.Home.toString(),
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screens.Home.toString()) {
            HomeView(navController)
        }
        composable(route = Screens.Login.toString()) {
            LoginView(navController)
        }
        composable(route = Screens.Register.toString()) {
            RegisterView(navController)
        }
    }
}