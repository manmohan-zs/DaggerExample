package com.example.daggerstarter;

import dagger.Component;

@Component(modules = MemoryCardModule.class)
public interface SmartPhoneComponent {

    SmartPhone getSmartPhone();

}
