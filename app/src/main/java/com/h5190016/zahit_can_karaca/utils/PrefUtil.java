package com.h5190016.zahit_can_karaca.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.h5190016.zahit_can_karaca.models.Constants;

public class PrefUtil {

    private  static SharedPreferences getPrefs(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setGamerName(Context context,String value)
    {
        getPrefs(context).edit().putString(Constants.PREF_GAMER_NAME_PARAMETER,value).apply();
    }

    public static String getGamerName(Context context)
    {
        return getPrefs(context).getString(Constants.PREF_GAMER_NAME_PARAMETER,"");
    }

    public static void setCounter(Context context,String value)
    {
        getPrefs(context).edit().putString(Constants.PREF__COUNTER_PARAMETER,value).apply();
    }

    public static String getCounter(Context context)
    {
        return getPrefs(context).getString(Constants.PREF__COUNTER_PARAMETER,"");
    }

    public static void setPoint(Context context,String value)
    {
        getPrefs(context).edit().putString(Constants.PREF_POINT_PARAMETER,value).apply();
    }

    public static String getPoint(Context context)
    {
        return getPrefs(context).getString(Constants.PREF_POINT_PARAMETER,"");
    }

    public static void setCategory(Context context,String value)
    {
        getPrefs(context).edit().putString(Constants.PREF_CATEGORY_PARAMETER,value).apply();
    }

    public static String getCategory(Context context)
    {
        return getPrefs(context).getString(Constants.PREF_CATEGORY_PARAMETER,"");
    }

}
