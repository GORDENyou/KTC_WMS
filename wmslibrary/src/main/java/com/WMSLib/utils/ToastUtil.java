package com.WMSLib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Gordenyou on 2017/11/14.
 */

public class ToastUtil {

    public static void show(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
