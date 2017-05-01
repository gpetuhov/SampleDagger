package com.gpetuhov.android.sampledagger.dagger.components;

import com.gpetuhov.android.sampledagger.SecondActivity;
import com.gpetuhov.android.sampledagger.dagger.modules.SecondModule;
import com.gpetuhov.android.sampledagger.dagger.scopes.SecondScope;

import dagger.Subcomponent;

// Since SecondComponent is subcomponent, it can access all instances provided
// by modules in its ancestor component (in AppComponent).
// Instances provided in SecondModule use instances, provided in AppModule.
// Subcomponents must have different scopes.
@Subcomponent(modules = SecondModule.class)
@SecondScope
public interface SecondComponent {
    void inject(SecondActivity activity);
}
