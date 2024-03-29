package com.notes.daggerexample.di.main;

import com.notes.daggerexample.network.main.MainApi;
import com.notes.daggerexample.ui.main.posts.PostsRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }


    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }
}
