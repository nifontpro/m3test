package ru.nb.m3test

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

	val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

	Scaffold(
		modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection ),
		topBar = {
			TopAppBar(
				scrollBehavior = scrollBehavior,
				navigationIcon = {
					IconButton(onClick = { /*TODO*/ }) {
						Icon(
							imageVector = Icons.Default.Menu,
							contentDescription = "Main menu"
						)
					}
				},
				title = { Text(text = "Main") },
//				colors = TopAppBarDefaults.smallTopAppBarColors(
//					containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(2.dp)
//				)

			)
		}
	) { paddingValues ->
		CustomList(paddingValues = paddingValues)
	}
}

@Composable
fun CustomList(paddingValues: PaddingValues) {
	val list = remember {
		mutableStateListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
	}

	LazyColumn(
		modifier = Modifier.padding(paddingValues)
	) {
		items(items = list, key = { it }) {
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