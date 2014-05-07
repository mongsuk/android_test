package com.example.pendingtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        onBtnClick();
        
    }
    
    public void onBtnClick() {
    		Log.e("test","test");
    		Toast.makeText(this, "onBtnClick", Toast.LENGTH_SHORT).show();
    		NotificationManager notificationManager = (NotificationManager)
    				getSystemService(NOTIFICATION_SERVICE);
    		Notification notification = new Notification(R.drawable.ic_launcher,
    				"알려드립니다.",System.currentTimeMillis());
    		
    		notification.setLatestEventInfo(this,"우편물 도착","소포가 배달되었다",null);
    		notificationManager.notify(0,notification);
    }
}
