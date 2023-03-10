package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button backBtn = (Button) findViewById(R.id.title_back);
        Button editBtn = (Button) findViewById(R.id.title_edit);
        backBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "backBtn has been clicked", Toast.LENGTH_SHORT).show();
                ((Activity) getContext()).finish();
            }
        });
        editBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "editBtn has been clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
