package com.example.daggerstarter;


import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {

    private int size;
    public MemoryCardModule(int size){
      this.size = size;
    }


    @Provides
    MemoryCard getMemoryCard() {
        return new MemoryCard();
    }

}
