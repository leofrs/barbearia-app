package com.example.barber.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.unit.dp

@Composable
fun HomeUserView(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
            .background(Color.Black)
    ){
        Column {
            Row(
                modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Logo here",
                    color = Color.White
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Sair")
                }
            }
            Box(
                modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .height(100.dp),
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Welcome!"
                    )
                    Text(
                        text = "Name user here"
                    )
                    Text(text = "The barbershop thanks you for your preference ")
                }
            }
            Box(modifier = Modifier.fillMaxSize()){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    ElevatedCard(
                        modifier = Modifier.height(100.dp).width(150.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "Days is here")
                        Text(text = "Date is here")
                    }
                }
            }
        }
    }
}