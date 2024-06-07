package com.ihsanarslan.sayfalararasigecis.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ihsanarslan.sayfalararasigecis.navigation.Router

@Composable
fun ScreenA(navController: NavController){
    val name = remember {
        mutableStateOf("")
    }
    val surname = remember {
        mutableStateOf("")
    }
    Column (modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = name.value,
            onValueChange = {string -> name.value = string },
            label = { Text(text = "Name") }
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = surname.value,
            onValueChange = { string -> surname.value = string },
            label = { Text(text = "Surname") }
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(Router.ScreenB(name.value,surname.value))
        }) {
            Text(text = "SayfaB'ye git")
        }
    }
}
