package com.example.lenovo.myapplication.model;

import com.example.lenovo.myapplication.ResultCallBack;
import com.example.lenovo.myapplication.base.BaesModel;

public class DateModel extends BaesModel{
    public void getNetDate(ResultCallBack<String> resultCallBack) {
        String s="MVP抽取";
        resultCallBack.onSuccess(s);
    }
}
