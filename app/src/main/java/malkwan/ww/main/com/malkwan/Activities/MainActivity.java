package malkwan.ww.main.com.malkwan.Activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import malkwan.ww.main.com.malkwan.R;

/**
 * Created by ADW on 2016/9/13.
 */
public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
    }
}
