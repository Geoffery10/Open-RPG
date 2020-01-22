package com.thecoredepository.mobile_rpg;

import android.content.Context;

public class Theming 
{
    private static Context context;
    private static int themeID;
    private static int fontColor;
    private static int coloredFontColor;
    private static int background;
    private static int cardViewBG;
    private static int spinnerStyle;

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        Theming.context = context;
    }

    public static int getThemeID() {
        return themeID;
    }

    public static void setThemeID(int themeID) {
        Theming.themeID = themeID;
    }

    public static int getFontColor() {
        return fontColor;
    }

    public static void setFontColor(int fontColor) {
        Theming.fontColor = fontColor;
    }

    public static int getColoredFontColor() {
        return coloredFontColor;
    }

    public static void setColoredFontColor(int coloredFontColor) {
        Theming.coloredFontColor = coloredFontColor;
    }

    public static int getBackground() {
        return background;
    }

    public static void setBackground(int background) {
        Theming.background = background;
    }

    public static int getCardViewBG() {
        return cardViewBG;
    }

    public static void setCardViewBG(int cardViewBG) {
        Theming.cardViewBG = cardViewBG;
    }

    public static int getSpinnerStyle() {
        return spinnerStyle;
    }

    public static void setSpinnerStyle(int spinnerStyle) {
        Theming.spinnerStyle = spinnerStyle;
    }
}
