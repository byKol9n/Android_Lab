package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView textViewStudent;
private Button WhoAmI;
private Button ItsNotMe;
private CheckBox checkBox;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.textViewStudent);
        WhoAmI = findViewById(R.id.WhoAmI);
        ItsNotMe = findViewById(R.id.ItsNotMe);
        checkBox = findViewById(R.id.checkBox);
        View.OnClickListener oclWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 15");
                checkBox.setChecked(true);
            }
        };
        WhoAmI.setOnClickListener(oclWhoAmI);

    }
    public void onMyButtonClick (View view) {
        Toast.makeText(this, "Ещё один способ", Toast.LENGTH_SHORT).show();
        checkBox.setChecked(true);
        textViewStudent.setText("Привет, это не Я");
    }

}