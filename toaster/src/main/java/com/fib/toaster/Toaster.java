package com.fib.toaster;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fibrahim on 1/29/18.
 */

public class Toaster {

    public static void shortToast (Context context, String msg)
    {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void longToast (Context context, String msg)
    {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}