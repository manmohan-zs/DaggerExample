package com.example.daggerstarter;

import android.app.Application;

public class App extends Application {

    private static App app;

    SmartPhoneComponent smartPhoneComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.app = this;

        smartPhoneComponent = DaggerSmartPhoneComponent.builder().memoryCardModule(new MemoryCardModule(100)).build();
    }

    public static App getApp(){
        return app;
    }

    public SmartPhoneComponent getSmartPhoneComponent(){
        return  smartPhoneComponent;
    }
}
