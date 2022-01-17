package com.example.daggerstarter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder().memoryCardModule(new MemoryCardModule(4)).build();
        //smartPhoneComponent.inject(this);

        App.getApp().getSmartPhoneComponent().inject(this);

        smartPhone.makeACall();


    }
}
