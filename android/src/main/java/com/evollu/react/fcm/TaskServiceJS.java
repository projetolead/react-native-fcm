package com.evollu.react.fcm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;

/**
 * Created by lucas.castro on 25/08/2017.
 */

public class TaskServiceJS extends HeadlessJsTaskService {
    @Override
    protected HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        Log.d("TaskServiceJS", "task invoked in java");

        Bundle extras = intent.getExtras();
        return new HeadlessJsTaskConfig("NOTIFICATION", Arguments.fromBundle(extras.getBundle("notification")), 5000, true);
    }
}
