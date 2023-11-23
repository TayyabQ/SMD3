package com.tayyabqaisar.proj2;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public class ScreenshotObserver extends ContentObserver {

    public ScreenshotObserver(Handler handler) {
        super(handler);
    }

    @Override
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);

        // send notification

        welcomeActivity.sendNotification("A screenshot of welcome screen was taken");

    }


}
