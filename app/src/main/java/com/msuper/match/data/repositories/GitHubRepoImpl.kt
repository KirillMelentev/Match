package com.msuper.match.data.repositories

import com.msuper.match.data.retrofit.services.GitHubService
import com.msuper.match.domain.models.AllData
import com.msuper.match.domain.repositories.GitHubRepo
import javax.inject.Inject

class GitHubRepoImpl @Inject constructor(private val gitHubService: GitHubService) : GitHubRepo {
    override suspend fun getAllData(): AllData {
        val readmeJson = gitHubService.getReadmeJson()
        return AllData(
            link = readmeJson.link
        )
    }
}