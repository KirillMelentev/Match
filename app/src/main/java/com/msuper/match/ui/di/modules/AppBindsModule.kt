package com.msuper.match.ui.di.modules

import com.msuper.match.data.repositories.GitHubRepoImpl
import com.msuper.match.domain.repositories.GitHubRepo
import dagger.Binds
import dagger.Module

@Module
interface AppBindsModule {

    @Binds
    fun bindGitHubRepoImpl(gitHubRepoImpl: GitHubRepoImpl): GitHubRepo
}