package ru.mirea.maiorova.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String currentTime = getIntent().getStringExtra("currentTime");

        String displayText = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ(номер 16) В ГРУППЕ СОСТАВЛЯЕТ 256, а текущее время " + currentTime;

        TextView textView = findViewById(R.id.textView);
        textView.setText(displayText);
    }
}