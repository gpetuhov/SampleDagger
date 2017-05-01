package com.gpetuhov.android.sampledagger.dagger.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

// This is scope declaration.
// Scopes allow to control lifecycle of the instances provided in modules.
// But we must control it MANUALLY by instantiating and clearing corresponding components.
// In our example we have 2 scopes: @Singleton (provided by default) and @SecondScope.
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondScope {
}