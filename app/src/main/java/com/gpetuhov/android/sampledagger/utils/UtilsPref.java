package com.gpetuhov.android.sampledagger.utils;

import android.content.SharedPreferences;

public class UtilsPref {

    public static final String BUTTON_NAME = "button_name";

    private SharedPreferences prefs;

    public UtilsPref(SharedPreferences prefs) {
        this.prefs = prefs;
    }

    public String getMainButtonName() {
        return getStringFromPrefs(BUTTON_NAME);
    }

    public void setMainButtonName(String name) {
        setStringInPrefs(BUTTON_NAME, name);
    }

    private String getStringFromPrefs(String key) {
        return prefs.getString(key, "");
    }

    private void setStringInPrefs(String key, String value) {
        prefs.edit()
                .putString(key, value)
                .apply();
    }
}
