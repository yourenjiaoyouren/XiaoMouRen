package com.example.lenovo.myapplication;

public interface ResultCallBack<T> {
    void onSuccess(String s);
    void onFail(String msg);
}
