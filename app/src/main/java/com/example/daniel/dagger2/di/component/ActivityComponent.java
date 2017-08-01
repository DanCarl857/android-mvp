package com.example.daniel.dagger2.di.component;

import com.example.daniel.dagger2.MainActivity;
import com.example.daniel.dagger2.di.PerActivity;
import com.example.daniel.dagger2.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by daniel on 8/1/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
