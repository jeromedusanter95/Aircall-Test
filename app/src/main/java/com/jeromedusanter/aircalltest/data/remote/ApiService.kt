package com.jeromedusanter.aircalltest.data.remote

import com.jeromedusanter.aircalltest.data.remote.repogithub.models.RepoGithubApiResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search/repositories")
    fun fetchRepositories(
        @Query("sort") sort: String?,
        @Query("order") order: String?,
        @Query("page") page: Long? = 1,
        @Query("per_page") perPage: Long?,
        @Query("q") query: String
    ): Single<RepoGithubApiResponse>
}