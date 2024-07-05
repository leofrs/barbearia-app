package com.example.barber.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.barber.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterView(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.BottomCenter
    ){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.FillHeight,
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .background(Color.Black, shape = RoundedCornerShape(50))
                    .width(234.dp)
                    .height(44.dp)
                    .padding(vertical = 8.dp),
                text = "Faça o seu cadastro",
                textAlign = TextAlign.Center,
                color = White,
                fontSize = 24.sp
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Nome",
                        color = Black
                    )},
                placeholder = {
                    Text(
                        text = "Insira seu nome",
                        color = Black
                    ) },
                maxLines = 1,
                textStyle = TextStyle(Black),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = White,
                    unfocusedBorderColor = Black)
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Número",
                        color = Black
                    )},
                placeholder = {
                    Text(
                        text = "Insira seu número",
                        color = Black
                    ) },
                maxLines = 1,
                textStyle = TextStyle(Color.Black),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = White,
                    unfocusedBorderColor = Black)
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Senha",
                        color = Black
                    )},
                placeholder = {
                    Text(
                        text = "Insira sua senha",
                        color = Black
                    ) },
                maxLines = 1,
                textStyle = TextStyle(Black),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = White,
                    unfocusedBorderColor = Black)
            )
            Spacer(modifier = Modifier.height(16.dp))
            ElevatedButton(
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = "Cadastrar",
                    color = Blue
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Text(
                    text = "Já possui cadastro?",
                    color = Black
                )
                Text(
                    modifier = Modifier.clickable { navController.navigate("Login") },
                    text = "Faça o login",
                    color = Blue
                )
            }
        }
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = "₢ L.S Development",
            color = White
        )
    }
}