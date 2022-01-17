package com.example.daggerstarter;


import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {


    @Provides
    MemoryCard getMemoryCard() {
        return new MemoryCard();
    }

}
