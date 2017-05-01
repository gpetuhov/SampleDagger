package com.gpetuhov.android.sampledagger.dagger.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.gpetuhov.android.sampledagger.utils.UtilsPref;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

// AppModule provides Context, SharedPreferences and UtilsPrefs instances
// (only one instance of each class).
@Module
public class AppModule {
    Context context;

    public AppModule(Application application) {
        context = application.getApplicationContext();
    }

    @Provides
    @Singleton
    Context providesContext() {
        return context;
    }

    @Provides
    @Singleton
    SharedPreferences providesPrefs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    UtilsPref providesUtilsPrefs(SharedPreferences prefs) {
        return new UtilsPref(prefs);
    }
}
