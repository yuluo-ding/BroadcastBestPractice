package com.example.yu.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by yu on 2015/5/5.
 */
public class ActivityCollector {
    public static ArrayList<Activity> activities = new ArrayList<Activity>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
