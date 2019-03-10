package com.example.lenovo.myapplication.base;

public abstract class BasePresenter<V extends BaseView> {
    protected V view;

    public BasePresenter() {
        initModel();
    }
    protected abstract void initModel();

    public void attachView(V view) {
        this.view=view;
    }
}
