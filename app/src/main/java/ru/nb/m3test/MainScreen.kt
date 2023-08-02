package ru.nb.m3test

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

//	val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
	val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

	Scaffold(
		modifier = Modifier
			.fillMaxSize()
			.nestedScroll(scrollBehavior.nestedScrollConnection),
		topBar = {
			LargeTopAppBar(
				scrollBehavior = scrollBehavior,
				navigationIcon = {
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.Menu,
							contentDescription = "Main menu"
						)
					}
				},
				title = {
					Row(verticalAlignment = Alignment.CenterVertically) {
						IconButton(onClick = { /*TODO*/ }) {
							Icon(
								imageVector = Icons.Default.FavoriteBorder,
								contentDescription = "Mark as favorite"
							)
						}
						Text(text = "Main")
					}
				},
//				colors = TopAppBarDefaults.smallTopAppBarColors(
//					containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(2.dp)
//				)
				actions = {
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.FavoriteBorder,
							contentDescription = "Mark as favorite"
						)
					}
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.Edit,
							contentDescription = "Edit notes"
						)
					}
				}
			)
		}
	) { paddingValues ->
		CustomList(paddingValues = paddingValues)
	}
}

@Composable
fun CustomList(paddingValues: PaddingValues) {
	LazyColumn(
		modifier = Modifier.padding(paddingValues)
	) {
		items(100) {
			Text(
				text = "$it", modifier = Modifier
					.fillMaxWidth()
					.padding(all = 16.dp),
				style = androidx.compose.ui.text.TextStyle(
					fontSize = MaterialTheme.typography.titleLarge.fontSize,
					fontWeight = FontWeight.Medium
				)
			)
		}
	}
}