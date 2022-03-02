package com.example.imagechangehw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView= (ImageView) findViewById(R.id.imageViewBuff1);
        imageView.setImageResource(R.drawable.buff1);

        Button button = (Button) findViewById(R.id.buttonNewImage);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.buff2);
            }
        });
    }
}