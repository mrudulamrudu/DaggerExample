package com.notes.daggerexample.di.auth;

import androidx.lifecycle.ViewModel;

import com.notes.daggerexample.di.ViewModelKey;
import com.notes.daggerexample.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(getValue = AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);

}
