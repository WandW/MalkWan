package malkwan.ww.main.com.malkwan;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by ADW on 2016/9/12.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
