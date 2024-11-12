package com.msuper.match.data.retrofit.services

import com.msuper.match.data.retrofit.models.ReadmeJson
import retrofit2.http.GET

interface GitHubService {
    @GET("KirillMelentev/Match/refs/heads/master/README.md")
    suspend fun getReadmeJson(): ReadmeJson
}