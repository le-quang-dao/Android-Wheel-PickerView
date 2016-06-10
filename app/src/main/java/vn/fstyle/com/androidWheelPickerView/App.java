package vn.fstyle.com.androidWheelPickerView;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Copyright © 2016 FStyleVN
 * Created by Sun on 11/06/2016.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}
