package com.duality.fitnesstogether.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.duality.fitnesstogether.ui.registration.RegistrationPage1
import kotlinx.serialization.Serializable

@Serializable
object GreetingMenu

@Serializable
object RegistrationPage1

@Serializable
object RegistrationPage2

@Serializable
object LoginPage

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = GreetingMenu
    ) {
        composable<GreetingMenu> {
            GreetingMenuScreen(
                navigateToRegistration = { navController.navigate(route = RegistrationPage1) },
                navigateToLogin =  { navController.navigate(route = LoginPage) }
            )
        }

        composable<RegistrationPage1> {
            RegistrationPage1(
                onBack = { navController.popBackStack() },
                onNext = { navController.navigate(route = RegistrationPage2) }
            )
        }

        composable<RegistrationPage2> {}

        composable<LoginPage> {}
    }
}