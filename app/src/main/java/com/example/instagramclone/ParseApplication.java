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
                //.applicationId("GufQ9v5JZvX9C8ZEU0BJh49N2SdMNNPDNpWbklC5")
                //.clientKey("BAGFZsSKuXctnlclgGUGdNVzc8KpyME8YSGORngq")
                .applicationId("qqdfh5jUjj4pPSRL23JwUOzuCMB89VUhloybPUER") // should correspond to Application Id env variable
                .clientKey("TdkklrceeBqXg7rO7PsL7v6LuHyNuPnxRizDPOxf")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());

    }
}
