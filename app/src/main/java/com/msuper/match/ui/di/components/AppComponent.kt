package com.msuper.match.ui.di.components

import com.msuper.match.ui.di.modules.AppBindsModule
import com.msuper.match.ui.di.modules.NetworkModule
import com.msuper.match.ui.di.modules.ViewModelsModule
import com.msuper.match.ui.di.view_models.MultiViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Component(modules = [
    NetworkModule::class, ViewModelsModule::class, AppBindsModule::class
])
@Singleton
interface AppComponent {
    val viewModelFactory : MultiViewModelFactory
}