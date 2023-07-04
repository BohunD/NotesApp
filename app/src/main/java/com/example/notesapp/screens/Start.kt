package com.example.notesapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Colors
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.notesapp.navigation.NavRoute
import com.example.notesapp.ui.theme.NotesAppTheme
import com.example.notesapp.ui.theme.backgroundColor

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun StartScreen(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()
    ) {
        Column(
           modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ){
            Text(text = "What will we use?")
            Button(
                onClick = {
                          navController.navigate(route = NavRoute.Main.route)
                          },
                modifier = Modifier
                    .width(200.dp)
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ){
                Text(text = "Room database")
            }
            Button(
                onClick = {
                    navController.navigate(route = NavRoute.Main.route)
                },
                modifier = Modifier
                    .width(200.dp)
                    .padding(vertical = 5.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ){
                Text(text = "Firebase database")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevStartScreen(){
    NotesAppTheme {
        StartScreen(navController = rememberNavController())
    }
}