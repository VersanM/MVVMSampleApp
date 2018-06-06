package com.versanm.mvvmsampleapp.ui.main;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    MainView provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    MainViewModel provideMainViewModel(MainViewModel mainViewModel) {
        return mainViewModel;
    }
}
