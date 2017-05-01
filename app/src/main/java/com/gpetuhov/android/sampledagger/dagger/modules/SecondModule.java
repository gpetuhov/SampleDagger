package com.gpetuhov.android.sampledagger.dagger.modules;

import com.gpetuhov.android.sampledagger.dagger.scopes.SecondScope;
import com.gpetuhov.android.sampledagger.utils.TextFiller;
import com.gpetuhov.android.sampledagger.utils.UtilsPref;

import dagger.Module;
import dagger.Provides;

// SecondModule has access to UtilsPref instance to provide TextFiller instance,
// since SecondComponent is subcomponent of Appcomponent.
@Module
public class SecondModule {

    @Provides
    @SecondScope
    TextFiller providesTextFiller(UtilsPref utilsPref) {
        return new TextFiller(utilsPref);
    }
}
