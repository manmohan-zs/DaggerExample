package com.example.daggerstarter;


import dagger.Module;
import dagger.Provides;

@Module
public class NickelCadiumModule {

    @Provides
    Battery providesBattery(NickelCadiumBattery nickelCadiumBattery){
        nickelCadiumBattery.showType();
        return nickelCadiumBattery;
    }
}
