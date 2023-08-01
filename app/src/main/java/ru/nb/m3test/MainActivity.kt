package ru.nb.m3test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.nb.m3test.ui.theme.M3testTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			M3testTheme {
				MainScreen()
			}
		}
	}
}