package com.example.lenovo.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lenovo.myapplication.base.BaseActivity;
import com.example.lenovo.myapplication.presenter.DatePresenter;
import com.example.lenovo.myapplication.view.DateView;

public class MainActivity extends BaseActivity<DateView, DatePresenter> implements DateView {

    private TextView Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void inteView() {
        mpresenter.getNetDate();
    }

    @Override
    protected DatePresenter intePresenter() {
        return new DatePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void getNetDate(String s) {
        Tv.setText(s);
    }

    private void initView() {
        Tv = (TextView) findViewById(R.id.Tv);
    }
}
