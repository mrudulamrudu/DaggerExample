package com.notes.daggerexample.di;

import android.app.Application;

import com.notes.daggerexample.BaseApplication;
import com.notes.daggerexample.session.SessionManager;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class
        }
)

public interface AppComponent extends AndroidInjector<BaseApplication> {

    SessionManager sessionManager();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder Application(Application application);

        AppComponent build();
    }
}
