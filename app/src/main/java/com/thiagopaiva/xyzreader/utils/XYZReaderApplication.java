package com.thiagopaiva.xyzreader.utils;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.facebook.drawee.backends.pipeline.Fresco;

public class XYZReaderApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
