package com.example.daggerstarter;

import android.util.Log;

import javax.inject.Inject;

public class NickelCadiumBattery implements Battery{
    @Inject
    public NickelCadiumBattery(){

    }

    @Override
    public void showType() {
        Log.d(
                "MyTAG", "showType: is nickelCadium");
    }
}
