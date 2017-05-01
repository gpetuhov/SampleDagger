package com.gpetuhov.android.sampledagger.dagger.components;

import com.gpetuhov.android.sampledagger.MainActivity;
import com.gpetuhov.android.sampledagger.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
