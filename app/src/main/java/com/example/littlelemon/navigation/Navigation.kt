package com.example.littlelemon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.littlelemon.screens.Home
import com.example.littlelemon.screens.Onboarding
import com.example.littlelemon.screens.Profile

@Composable
fun Navigation(navController: NavHostController) {

    // TODO: Add Logic for startDestination
    val startDestination = Home.route

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Home.route) {
            Home()
        }
        composable(Profile.route) {
            Profile()
        }
        composable(Onboarding.route) {
            Onboarding(navController = navController)
        }
    }
}