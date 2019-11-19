package com.notes.daggerexample.di;

import com.notes.daggerexample.di.auth.AuthModule;
import com.notes.daggerexample.di.auth.AuthViewModelModule;
import com.notes.daggerexample.di.main.MainFragmentBuildersModule;
import com.notes.daggerexample.di.main.MainModule;
import com.notes.daggerexample.di.main.MainViewModelModule;
import com.notes.daggerexample.ui.auth.AuthActivity;
import com.notes.daggerexample.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(modules = {MainFragmentBuildersModule.class, MainViewModelModule.class,
            MainModule.class})
    abstract MainActivity contributeMainActivity();
}
