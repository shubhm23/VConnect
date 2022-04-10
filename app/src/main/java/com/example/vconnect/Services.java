package com.example.vconnect;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Services extends Activity {
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        b1 = findViewById(R.id.btnWifi);
        b2 = findViewById(R.id.btnRemoteSetting);
        b3 = findViewById(R.id.btnScreenMirror);
        b4 = findViewById(R.id.btnStorage);

        b1.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Wifi and Bluetooth Settings", Toast.LENGTH_SHORT).show();
        });

        b2.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Remote Setting", Toast.LENGTH_SHORT).show();
        });

        b3.setOnClickListener(view -> {
            enablingWiFiDisplay();
            Toast.makeText(Services.this, "Screen Mirroring", Toast.LENGTH_SHORT).show();
        });

        b4.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Storage", Toast.LENGTH_SHORT).show();
        });
    }

    public void enablingWiFiDisplay() {
        try {
            startActivity(new Intent("android.settings.WIFI_DISPLAY_SETTINGS"));
            return;
        } catch (ActivityNotFoundException activitynotfoundexception) {
            activitynotfoundexception.printStackTrace();
        }

        try {
            startActivity(new Intent("android.settings.CAST_SETTINGS"));
            return;
        } catch (Exception exception1) {
            Toast.makeText(getApplicationContext(), "Device not supported", Toast.LENGTH_LONG).show();
        }
    }

}