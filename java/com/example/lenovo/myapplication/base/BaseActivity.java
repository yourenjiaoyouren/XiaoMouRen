package com.example.lenovo.myapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<V extends BaseView,T extends BasePresenter> extends AppCompatActivity
implements BaseView{
    protected T mpresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mpresenter =intePresenter();
        if (mpresenter!=null){
            mpresenter.attachView(this);
        }
        inteView();
        inteDate();

    }

    private void inteDate() {

    }

    protected abstract void inteView();

    protected abstract T intePresenter();

    protected abstract int getLayoutId();
}
