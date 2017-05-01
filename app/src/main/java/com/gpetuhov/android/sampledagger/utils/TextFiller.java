package com.gpetuhov.android.sampledagger.utils;

// TextFiller uses UtilsPref instance
public class TextFiller {
    private UtilsPref utilsPref;

    public TextFiller(UtilsPref utilsPref) {
        this.utilsPref = utilsPref;
    }

    public String getText() {
        String text =
                "Name of the button, you just pressed, is: "
                + utilsPref.getMainButtonName();
        return text;
    }
}
