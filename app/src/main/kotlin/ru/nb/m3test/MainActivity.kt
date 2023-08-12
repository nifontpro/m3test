package ru.nb.m3test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.nb.m3test.ui.theme.M3testTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MainContent()
		}
	}
}

@Composable
fun MainContent() {
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
					onMainScreen = { navController.navigate("main") },
					onBottomScreen = { navController.navigate("bottom") },
					onFlowScreen = { navController.navigate("flow") },
				)
			}
			composable("bottom") {
				BottomNavScreen(onBack = { navController.popBackStack() })
			}
			composable("flow") {
				FlowScreen()
			}
		}
	}
}