package ru.nb.m3test

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FlowViewModel @Inject constructor(
	val string: String
): ViewModel() {

	var state by mutableStateOf<List<Int>>(emptyList())
		private set

	private val flow1 = (1..10).asFlow().onEach { delay(1000) }
	private val flow2 = (11..20).asFlow().onEach { delay(500) }
	private val flow3 = (21..30).asFlow().onEach { delay(1500) }

	init {
		viewModelScope.launch {

		}
		merge(flow1, flow2, flow3).onEach {
			state = state + it
		}.launchIn(viewModelScope)
	}

}