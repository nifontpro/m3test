package ru.nb.m3test

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

@Composable
fun ButtonScreen(
	onMainScreen: () -> Unit
) {
	Column(
		modifier = Modifier.fillMaxSize(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {

		Button(onClick = onMainScreen,
			modifier = Modifier.testTag("main")) {
			Text(text = "Main screen")
		}

		ElevatedButton(onClick = {}) {
			Icon(
				imageVector = Icons.Default.Add,
				contentDescription = "add to card",
				modifier = Modifier.size(18.dp)
			)
			Spacer(modifier = Modifier.width(8.dp))
			Text(text = "Add to card")
		}

		FilledTonalButton(onClick = {  }) {
			Text("Open in browser")
		}

		OutlinedButton(onClick = {  }) {
			Text("Outlined Button")
		}

		TextButton(onClick = {  }) {
			Text("Text Button")
		}

	}
}