package com.gpetuhov.android.sampledagger.dagger.components;

import com.gpetuhov.android.sampledagger.SecondActivity;
import com.gpetuhov.android.sampledagger.dagger.modules.SecondModule;
import com.gpetuhov.android.sampledagger.dagger.scopes.SecondScope;

import dagger.Subcomponent;

@Subcomponent(modules = SecondModule.class)
@SecondScope
public interface SecondComponent {
    void inject(SecondActivity activity);
}
