package com.example.barber

enum class Screen {
    Home,
    Login,
    Register,
    HomeUser
}
sealed class Screens(val route: String) {
    data object Home : Screens(Screen.Home.name)
    data object Login : Screens(Screen.Login.name)
    data object Register : Screens(Screen.Register.name)
    data object HomeUser: Screens(Screen.HomeUser.name)
}
