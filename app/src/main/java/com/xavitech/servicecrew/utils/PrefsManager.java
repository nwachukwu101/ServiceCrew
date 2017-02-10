package com.xavitech.servicecrew.utils;

/**
 * Created by XAVIER on 2/6/2017.
 */
import android.content.Context;
import android.content.SharedPreferences;
public class PrefsManager {
    private Context mContext;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    //shared preference mode
    private final int PRIVATE_MODE = 0;
    // Shared preferences file name
    private static final String PREF_NAME = "service-crew-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public  PrefsManager(Context context){
        this.mContext = context;
        mSharedPreferences = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        mEditor = mSharedPreferences.edit();
    }

    public void setIsFirstTimeLaunch(boolean isFirstTime){
        mEditor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime).commit();
    }

    public boolean isFirstTimeLaunch(){
        return mSharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
