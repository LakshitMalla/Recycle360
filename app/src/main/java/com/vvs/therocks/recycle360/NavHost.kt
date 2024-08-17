package com.vvs.therocks.recycle360

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

@Composable
fun NavHost(navController: NavHostController){
   NavHost(navController,"splash") {
       composable("splash"){
           SplashScreen(navController)
       }
       composable("Login"){
           LoginScreen()
       }
   }
}