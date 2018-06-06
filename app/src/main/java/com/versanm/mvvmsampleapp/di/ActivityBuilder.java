package com.versanm.mvvmsampleapp.di;

import com.versanm.mvvmsampleapp.ui.main.MainActivity;
import com.versanm.mvvmsampleapp.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@SuppressWarnings("unused")
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity provideMainActivityInjector();
}
