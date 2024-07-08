package com.example.barber

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.barber.views.HomeUserView
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
        startDestination = startDestination,
    ) {
        composable(
            route = Screens.Home.toString(),
            enterTransition = { fadeIn(animationSpec = tween(2000))},
            exitTransition = { fadeOut(animationSpec = tween(2000)) }
        ) {
            //HomeUserView()
            HomeView(navController)
        }
        composable(
            route = Screens.Login.toString(),
            enterTransition = { fadeIn(animationSpec = tween(2000))},
            exitTransition = { fadeOut(animationSpec = tween(2000)) }
        ) {
            LoginView(navController)
        }
        composable(
            route = Screens.Register.toString(),
            enterTransition = { fadeIn(animationSpec = tween(2000))},
            exitTransition = { fadeOut(animationSpec = tween(2000)) }
        ) {
            RegisterView(navController)
        }
    }
}