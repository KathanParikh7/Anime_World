package com.kathanparikh.animeworld.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.kathanparikh.animeworld.R;

public class Utility {

    private Utility() {
        //Private constructor (Utility.java cannot be instantiated)
    }

    /**
     * Set color of status bar and icons in status bar based on ui mode (night or not night)
     *
     * @param activity Activity
     */
    public static void setStatusBarColorBasedOnDayNightMode(Activity activity) {
        int nightModeFlags = activity.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (nightModeFlags) {
            case Configuration.UI_MODE_NIGHT_YES:
                activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, R.color.black));
                break;

            case Configuration.UI_MODE_NIGHT_NO:
            case Configuration.UI_MODE_NIGHT_UNDEFINED:
                activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, R.color.white));
                activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                break;
        }
    }
}
