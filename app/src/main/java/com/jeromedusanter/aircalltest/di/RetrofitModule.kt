package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.BuildConfig
import com.jeromedusanter.aircalltest.data.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RetrofitModule {

    @Provides
    @Singleton
    internal fun provideRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
            .apply { setLevel(HttpLoggingInterceptor.Level.BODY) }

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    @Provides
    @Singleton
    internal fun provideDataService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}