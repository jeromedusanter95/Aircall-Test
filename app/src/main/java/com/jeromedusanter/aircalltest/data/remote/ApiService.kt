package com.jeromedusanter.aircalltest.data.remote

import com.jeromedusanter.aircalltest.data.remote.repogithub.models.IssueApi
import com.jeromedusanter.aircalltest.data.remote.repogithub.models.RepoGithubApiResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/repositories")
    fun fetchRepositories(
        @Query("sort") sort: String?,
        @Query("order") order: String? = "desc",
        @Query("page") page: Int? = 1,
        @Query("per_page") perPage: Int,
        @Query("q") query: String
    ): Single<RepoGithubApiResponse>

    @GET("repos/{owner}/{repo}/issues")
    fun fetchIssuesByRepo(
        @Path("owner") owner: String,
        @Path("repo") repo: String,
        @Query("since") since: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<List<IssueApi>>
}