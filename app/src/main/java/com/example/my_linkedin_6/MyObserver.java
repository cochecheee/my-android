package com.example.my_linkedin_6;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyObserver implements LifecycleObserver {
    String LOG_TAG = "lifecycle_monitor";
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void connect() {
        Log.i(LOG_TAG,"onResume()");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void disconnect(){
        Log.i(LOG_TAG,"onPause()");
    }
}
