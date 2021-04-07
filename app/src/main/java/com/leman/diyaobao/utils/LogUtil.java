package com.leman.diyaobao.utils;

import android.util.Log;

/**
 * @author: jiaxin
 * @date: 2017-02-20 10:03
 */

public class LogUtil {

    private static boolean DEBUG = true;

    public static void setDebugMode(boolean debug) {
        DEBUG = debug;
    }

    public static void v(String tag, String msg) {
        if (DEBUG) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void d(String msg) {
        if (DEBUG) {
            Log.d("Common", msg);
        }
    }

    public static void SHOW(String msg) {
        Log.d("Common", msg);
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.e(tag, msg);
        }
    }

    public static void exception(String tag, String msg, Throwable e) {
        if (DEBUG) {
            Log.e(tag, msg, e);
        }
    }

}
