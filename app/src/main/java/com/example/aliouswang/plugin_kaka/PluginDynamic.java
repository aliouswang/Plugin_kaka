package com.example.aliouswang.plugin_kaka;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class PluginDynamic implements IDynamic{

    @Override
    public String getString(Context context) {
        return context.getResources().getString(R.string.plugin_str);
    }

    @Override
    public Drawable getDrawable(Context context) {
        return null;
    }
}
