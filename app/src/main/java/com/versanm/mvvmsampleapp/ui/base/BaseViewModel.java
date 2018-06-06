package com.versanm.mvvmsampleapp.ui.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel extends ViewModel implements IViewModel {

    private final CompositeDisposable compositeDisposable = new CompositeDisposable();


}
