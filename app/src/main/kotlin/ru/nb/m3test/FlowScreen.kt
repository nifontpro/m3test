package ru.nb.m3test

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FlowScreen() {
	val viewModel: FlowViewModel = hiltViewModel()
	val state = viewModel.state
	Text(text = viewModel.string)
	LazyColumn {
		items(state) {
			Text("Item $it")
		}
	}
}