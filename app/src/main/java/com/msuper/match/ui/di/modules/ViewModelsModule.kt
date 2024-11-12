package com.msuper.match.ui.di.modules

import androidx.lifecycle.ViewModel
import com.msuper.match.ui.di.view_models.ViewModelKey
import com.msuper.match.ui.main_screen.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelsModule {

    @Binds
    @[IntoMap ViewModelKey(MainViewModel::class)]
    fun provideMainViewModel(mainViewModel: MainViewModel): ViewModel
}