package com.notes.daggerexample.di.main;

import androidx.lifecycle.ViewModel;

import com.notes.daggerexample.di.ViewModelKey;
import com.notes.daggerexample.ui.main.posts.PostsViewModel;
import com.notes.daggerexample.ui.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(getValue = ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(getValue = PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);

}
