package com.example.barber.model

data class CalendarModel(
    val id: Int,
    val dia: String,
    val data: String
)

data object CalendarObject {
    val calendar = listOf(
        CalendarModel(id = 1, dia = "Segunda", data = "15/07/2024" ),
        CalendarModel(id = 2, dia = "Terça", data = "16/07/2024"),
        CalendarModel(id = 2, dia = "Quarta", data = "17/07/2024"),
        CalendarModel(id = 2, dia = "Quinta", data = "18/07/2024"),
        CalendarModel(id = 2, dia = "Sexta", data = "19/07/2024"),
        CalendarModel(id = 2, dia = "Sábado", data = "20/07/2024")
    )
}
