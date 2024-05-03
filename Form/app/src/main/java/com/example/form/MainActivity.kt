package com.example.form

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.form.ui.theme.FormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    App ();
                }
            }
        }
    }
}

@Composable
fun App(){

    var nome by remember { mutableStateOf("") }
    var endereco by remember { mutableStateOf("") }
    var bairro by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }

    Column (
        Modifier
            .fillMaxWidth()
            .background(Color.White),
             horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            Modifier
                .padding(25.dp)
        ) {
        }
        Row (
            Modifier
                .padding(25.dp)
        ) {
            Text(text = "App cadastro", fontSize = 45.sp,
            style = TextStyle(
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            )
        }
        Row (Modifier
            .padding(10.dp)
        )
         {
             OutlinedTextField(
                 value = nome,
                 onValueChange = { nome = it },
                 label = { Text("Nome:") }
             )
            }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = endereco,
                onValueChange = { endereco = it },
                label = { Text("Endereço:") }
            )
        }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = bairro,
                onValueChange = { bairro = it },
                label = { Text("Bairro:") }
            )
        }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = cep,
                onValueChange = { cep = it },
                label = { Text("Cep:") }
            )
        }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = cidade,
                onValueChange = { cidade = it },
                label = { Text("Cidade:") }
            )
        }
        Row (
            Modifier
                .padding(10.dp)
        )
        {
            OutlinedTextField(
                value = estado,
                onValueChange = { estado = it },
                label = { Text("Estado:") }
            )
        }
        Row (
            Modifier
                .padding(17.dp)
        )
        {
            Button(onClick = {}) {
                Text(text = "Cadastrar!", fontSize = 23.sp,
                style = TextStyle(
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                )
                )
            }
        }
    }
}

@Composable
@Preview
fun AppPreview (){
    FormTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App ();
        }
    }
    App ();
}