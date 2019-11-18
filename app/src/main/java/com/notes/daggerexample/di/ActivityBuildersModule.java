package com.notes.daggerexample.di;

import com.notes.daggerexample.di.auth.AuthModule;
import com.notes.daggerexample.di.auth.AuthViewModelModule;
import com.notes.daggerexample.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();
}
