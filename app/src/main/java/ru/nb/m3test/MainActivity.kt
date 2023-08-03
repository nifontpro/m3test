package ru.nb.m3test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.nb.m3test.ui.theme.M3testTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			M3testTheme {
				val navController = rememberNavController()
				NavHost(
					navController = navController,
					startDestination = "button"
				) {

					composable("main") {
						MainScreen(onBack = { navController.popBackStack() })
					}
					composable("button") {
						ButtonScreen(
							onMainScreen = { navController.navigate("main") }
						)
					}
				}
			}
		}
	}
}