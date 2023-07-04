package com.example.notesapp.screens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.notesapp.navigation.NavRoute
import com.example.notesapp.ui.theme.NotesAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold (
            floatingActionButton = {
                FloatingActionButton(onClick = { navController.navigate(NavRoute.Add.route) }) {
                    Icon(imageVector = Icons.Filled.Add,
                        contentDescription = "Add icon",
                        tint = Color.White)
                }
            }
            ) {
        Column() {
            NoteItem("Note 1", "subtitle for note 1", navController)
            NoteItem("Note 2", "subtitle for note 2", navController)
            NoteItem("Note 3", "subtitle for note 3", navController)
            NoteItem("Note 4", "subtitle for note 4", navController)
        }
    }
}
@Composable
fun NoteItem(title: String, subtitle: String, navController: NavHostController){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp, horizontal = 24.dp)
        .clickable { navController.navigate(NavRoute.Note.route) },
        elevation = 6.dp
    ){
        Column(modifier = Modifier.padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = title, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = subtitle)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun prevMainScreen(){
    NotesAppTheme {
        MainScreen(navController = rememberNavController())
    }
}