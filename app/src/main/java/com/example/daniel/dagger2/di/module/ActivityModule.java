package com.example.daniel.dagger2.di.module;

import android.app.Activity;
import android.content.Context;

import com.example.daniel.dagger2.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by daniel on 8/1/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
