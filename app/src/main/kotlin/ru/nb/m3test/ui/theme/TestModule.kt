package ru.nb.m3test.ui.theme

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TestModule {

	@Provides
	@ViewModelScoped
	fun provideStr() = "Test String"

}