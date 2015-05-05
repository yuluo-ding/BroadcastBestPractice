package com.example.yu.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by yu on 2015/5/5.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
