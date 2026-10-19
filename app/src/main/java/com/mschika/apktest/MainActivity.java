package com.mschika.apktest;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int count = 0;
    private TextView counterText;
    private int dp(float value) {
        return (int)(value * getResources().getDisplayMetrics().density + 0.5f);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(dp(24), dp(24), dp(24), dp(24));
        root.setBackgroundColor(Color.rgb(248, 247, 252));

        TextView title = new TextView(this);
        title.setText("MSCHIKA");
        title.setTextColor(Color.rgb(65, 48, 110));
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, 1);

        TextView subtitle = new TextView(this);
        subtitle.setText("APK Test berhasil dibuka");
        subtitle.setTextColor(Color.rgb(70, 70, 80));
        subtitle.setTextSize(18);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, dp(12), 0, dp(24));

        counterText = new TextView(this);
        counterText.setText("Tombol ditekan: 0");
        counterText.setTextSize(18);
        counterText.setTextColor(Color.BLACK);
        counterText.setGravity(Gravity.CENTER);
        counterText.setPadding(0, dp(8), 0, dp(18));

        Button testButton = new Button(this);
        testButton.setText("TES TOMBOL");
        testButton.setOnClickListener(v -> {
            count++;
            counterText.setText("Tombol ditekan: " + count);
        });

        TextView note = new TextView(this);
        note.setText("Jika angka bertambah, tes dasar berhasil.");
        note.setTextSize(14);
        note.setTextColor(Color.DKGRAY);
        note.setGravity(Gravity.CENTER);
        note.setPadding(0, dp(24), 0, 0);

        root.addView(title, new LinearLayout.LayoutParams(-1, -2));
        root.addView(subtitle, new LinearLayout.LayoutParams(-1, -2));
        root.addView(counterText, new LinearLayout.LayoutParams(-1, -2));
        root.addView(testButton, new LinearLayout.LayoutParams(-1, -2));
        root.addView(note, new LinearLayout.LayoutParams(-1, -2));
        setContentView(root);
    }
}
