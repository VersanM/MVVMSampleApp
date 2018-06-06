package com.versanm.mvvmsampleapp.di;

import com.versanm.mvvmsampleapp.MyApp;

public final class InjectionHelper {

    private InjectionHelper() {
    }

    public static ApplicationComponent getApplicationComponent(MyApp application) {
        return DaggerApplicationComponent
                .builder()
                .application(application)
                .build();
    }
}
