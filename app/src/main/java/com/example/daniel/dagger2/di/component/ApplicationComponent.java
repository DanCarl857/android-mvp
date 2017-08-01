package com.example.daniel.dagger2.di.component;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.daniel.dagger2.DemoApplication;
import com.example.daniel.dagger2.data.DataManager;
import com.example.daniel.dagger2.data.DbHelper;
import com.example.daniel.dagger2.di.ApplicationContext;
import com.example.daniel.dagger2.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by daniel on 8/1/17.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPreferences getPreferenceHelper();

    DbHelper getDbHelper();
}
