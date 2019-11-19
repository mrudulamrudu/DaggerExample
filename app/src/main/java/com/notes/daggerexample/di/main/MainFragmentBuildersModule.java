package com.notes.daggerexample.di.main;

import com.notes.daggerexample.ui.main.posts.PostsFragment;
import com.notes.daggerexample.ui.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}
