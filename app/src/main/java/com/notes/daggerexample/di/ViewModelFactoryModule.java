package com.notes.daggerexample.di;

import androidx.lifecycle.ViewModelProvider;

import com.notes.daggerexample.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelProviderFactory
            (ViewModelProviderFactory viewModelProviderFactory);
}
