package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GufQ9v5JZvX9C8ZEU0BJh49N2SdMNNPDNpWbklC5")
                .clientKey("BAGFZsSKuXctnlclgGUGdNVzc8KpyME8YSGORngq")
                 // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());

    }
}
