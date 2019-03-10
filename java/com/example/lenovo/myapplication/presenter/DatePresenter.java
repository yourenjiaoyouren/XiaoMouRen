package com.example.lenovo.myapplication.presenter;

import android.view.View;

import com.example.lenovo.myapplication.ResultCallBack;
import com.example.lenovo.myapplication.base.BasePresenter;
import com.example.lenovo.myapplication.model.DateModel;
import com.example.lenovo.myapplication.view.DateView;

public class DatePresenter extends BasePresenter<DateView> {

    protected DateModel dateModel;

    @Override
    protected void initModel() {
        dateModel = new DateModel();

    }

    public void getNetDate() {
        dateModel.getNetDate(new ResultCallBack<String>() {
            @Override
            public void onSuccess(String s) {
                view.getNetDate(s);
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }
}
