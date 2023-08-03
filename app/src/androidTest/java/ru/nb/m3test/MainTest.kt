package ru.nb.m3test

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class MainTest {

	@get: Rule
	val rule = createComposeRule()

	@Test
	fun go_main_screen() {
		rule.setContent {
			MainContent()
		}

		rule.onNodeWithTag("list").assertDoesNotExist()
		rule.onNodeWithTag("main").performClick()
		rule.onNodeWithTag("list").assertIsDisplayed()
	}
}