package com.gpetuhov.android.sampledagger.utils;

import android.content.SharedPreferences;

public class UtilsPref {
    SharedPreferences prefs;

    public UtilsPref(SharedPreferences prefs) {
        this.prefs = prefs;
    }

    public String getStringFromPrefs(String key) {
        return prefs.getString(key, "");
    }

    public void setStringInPrefs(String key, String value) {
        prefs.edit()
                .putString(key, value)
                .apply();
    }
}
