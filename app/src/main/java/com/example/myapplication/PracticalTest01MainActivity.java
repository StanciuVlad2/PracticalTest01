package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class PracticalTest01MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practical_test01_main);
        Button btnstanga = findViewById(R.id.btnStanga);
        Button btnDreapte = findViewById(R.id.btnDreapta);

        btnstanga.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText teStanga = findViewById(R.id.teStanga);
                        try {
                            Integer current = Integer.parseInt(teStanga.getText().toString());
                            current++;
                            teStanga.setText(current.toString());
                        } catch (Exception e) {
                            Log.w("ERROR", "what an error");
                        }

                    }
                }
        );
        btnDreapte.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText teStanga = findViewById(R.id.teDreapta);
                        try {
                            Integer current = Integer.parseInt(teStanga.getText().toString());
                            current++;
                            teStanga.setText(current.toString());
                        } catch (Exception e) {
                            Log.w("ERROR", "what an error");
                        }

                    }
                }
        );
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(Constants.LEFT_COUNT, leftEditText.getText().toString());
        outState.putString(Constants.RIGHT_COUNT, rightEditText.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey(Constants.LEFT_COUNT)) {
            leftEditText.setText(savedInstanceState.getString(Constants.LEFT_COUNT));
        } else {
            leftEditText.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey(Constants.RIGHT_COUNT)) {
            rightEditText.setText(savedInstanceState.getString(Constants.RIGHT_COUNT));
        } else {
            rightEditText.setText(String.valueOf(0));
        }
    }

}