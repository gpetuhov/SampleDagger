package com.gpetuhov.android.sampledagger.dagger.components;

import com.gpetuhov.android.sampledagger.MainActivity;
import com.gpetuhov.android.sampledagger.dagger.modules.AppModule;
import com.gpetuhov.android.sampledagger.dagger.modules.SecondModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    SecondComponent plusSecondComponent(SecondModule secondModule);

    void inject(MainActivity activity);
}
