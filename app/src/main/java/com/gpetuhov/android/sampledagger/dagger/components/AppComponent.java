package com.gpetuhov.android.sampledagger.dagger.components;

import com.gpetuhov.android.sampledagger.MainActivity;
import com.gpetuhov.android.sampledagger.dagger.modules.AppModule;
import com.gpetuhov.android.sampledagger.dagger.modules.SecondModule;

import javax.inject.Singleton;

import dagger.Component;

// Module dependency graph is built in COMPONENTS (components describe dependencies between modules) !!!

// AppComponent injects instances from AppModule into MainActivity.
// And also AppComponent is the ancestor of SecondComponent subcomponent.
@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    // This method declaration tells Dagger that AppComponent is the ancestor or SecondComponent,
    // which uses SecondModule.
    SecondComponent plusSecondComponent(SecondModule secondModule);

    void inject(MainActivity activity);
}
