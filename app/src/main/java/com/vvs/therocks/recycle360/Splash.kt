package com.vvs.therocks.recycle360

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController:NavHostController){
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xff00665B)) {
    LaunchedEffect(key1 = null) {
        delay(2500)
        navController.navigate("Login")
    }
    }
}