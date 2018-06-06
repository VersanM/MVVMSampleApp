package com.versanm.mvvmsampleapp.di;

import android.app.Application;
import android.content.Context;

import com.versanm.mvvmsampleapp.MyApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    MyApp provideApplication(Application application) {
        return (MyApp) application;
    }
}
