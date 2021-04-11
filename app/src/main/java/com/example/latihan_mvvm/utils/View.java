package com.example.latihan_mvvm.utils;

import android.content.Context;
import android.widget.Toast;

public class View {
    public static void toast(Context context, String massage){
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show();
    }
}
