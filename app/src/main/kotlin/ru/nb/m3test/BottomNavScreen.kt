package ru.nb.m3test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavScreen(onBack: () -> Unit) {

	Scaffold(
		modifier = Modifier
			.fillMaxSize(),
		bottomBar = {
			BottomAppBar(
				actions = {
					IconButton(onClick = onBack) {
						Icon(
							imageVector = Icons.Default.ArrowBack,
							contentDescription = "Share contact"
						)
					}
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.Share,
							contentDescription = "Share contact"
						)
					}
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.Edit,
							contentDescription = "Edit notes"
						)
					}
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.Favorite,
							contentDescription = "Edit notes"
						)
					}
				}
			)
		}
	) { paddingValues ->
		Text(
			text = "Bottom nav screen",
			modifier = Modifier.padding(paddingValues)
		)
	}
}