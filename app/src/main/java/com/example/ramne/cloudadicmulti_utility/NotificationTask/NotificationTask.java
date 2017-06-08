package com.example.ramne.cloudadicmulti_utility.NotificationTask;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ramne.cloudadicmulti_utility.R;

public class NotificationTask extends AppCompatActivity {

    EditText mEditTExt;
    Button mButton;
    String notificationtext;
    final int NOTIF_ID = 1234;
    NotificationManager manager;
    Notification myNotication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_task);

        mEditTExt=(EditText)findViewById(R.id.edittext);
        mButton=(Button)findViewById(R.id.notify);

        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //API level 11
                notificationtext=mEditTExt.getText().toString();
                Intent intent = new Intent("com.rj.notitfications.SECACTIVITY");

                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationTask.this, 1, intent, 0);

                Notification.Builder builder = new Notification.Builder(NotificationTask.this);

                builder.setAutoCancel(false);
                builder.setTicker("this is ticker text");
                builder.setContentTitle("Cloudadic Multi Utility Notification");
                builder.setContentText(notificationtext);
                builder.setSmallIcon(R.drawable.icon);
                builder.setContentIntent(pendingIntent);
                builder.setOngoing(true);
                builder.setNumber(100);

                myNotication = builder.getNotification();
                manager.notify(11, myNotication);


            }
        });

    }

}



