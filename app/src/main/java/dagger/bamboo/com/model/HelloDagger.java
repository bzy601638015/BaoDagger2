package dagger.bamboo.com.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by bamboo on 17/8/25.
 */

public class HelloDagger {
    String des;

    @Inject
    public HelloDagger() {
        des = "Hello Dagger2";
    }

    public void print() {
        Log.d("bao", des);
    }
}
