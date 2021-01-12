package com.hfad.noughtsandcrosses;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    Button butHelp;
    TextView textViewHelp;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        count = 0;
        textViewHelp = findViewById(R.id.textViewHelp);
        butHelp = findViewById(R.id.butHelp);

    }

    public void onClickHelp(View view) {
        if (count == 0) {
            textViewHelp.setText("Помощи не будет.");
        }
        count++;
        if (count == 5) {
            textViewHelp.setText("Ты не понял? Помощи НЕ БУДЕТ!");
        } else if (count == 10) {
            textViewHelp.setText("Остановись...");
        } else if (count == 15) {
            finish();
        }
    }
}