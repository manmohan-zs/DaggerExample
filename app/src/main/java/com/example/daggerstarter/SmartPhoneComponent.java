package com.example.daggerstarter;

import dagger.Component;

@Component(modules = {MemoryCardModule.class, NickelCadiumModule.class})
public interface SmartPhoneComponent {

    void inject(MainActivity mainActivity);

}
