package com.msuper.match.domain.usecases

import com.msuper.match.domain.models.AllData
import com.msuper.match.domain.repositories.GitHubRepo
import javax.inject.Inject

class GetAllDataUseCase @Inject constructor(private val githubRepo : GitHubRepo) {
    suspend fun execute() : AllData {
        return githubRepo.getAllData()
    }
}