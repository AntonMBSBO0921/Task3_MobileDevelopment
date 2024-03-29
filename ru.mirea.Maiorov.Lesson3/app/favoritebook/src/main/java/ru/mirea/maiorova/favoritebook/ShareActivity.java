package ru.mirea.maiorova.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity {
    EditText editTextBookName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        editTextBookName = findViewById(R.id.editTextBookName);
    }

    public void sendBookName(View view) {
        String bookName = editTextBookName.getText().toString();

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, bookName);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}