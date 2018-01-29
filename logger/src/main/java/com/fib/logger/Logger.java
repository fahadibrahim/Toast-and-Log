package com.fib.logger;

import android.util.Log;

/**
 * Created by fibrahim on 1/29/18.
 */

public class Logger {

    private static String TAG = "APP";

    public static void setTag(String tag)
    {
        TAG = tag;
    }

    public static void d(String msg)
    {
        Log.d(TAG, msg);
    }

    public static void e(String msg)
    {
        Log.e(TAG, msg);
    }

    public static void i(String msg)
    {
        Log.i(TAG, msg);
    }
}