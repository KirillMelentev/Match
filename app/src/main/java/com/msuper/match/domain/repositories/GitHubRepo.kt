package com.msuper.match.domain.repositories

import com.msuper.match.domain.models.AllData

interface GitHubRepo {
    suspend fun getAllData(): AllData
}