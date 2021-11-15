package com.example.exameneval1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1Validar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1validar);



        EditText edt1_1 = (EditText) findViewById(R.id.edt1_1);
        EditText editTextDate = (EditText) findViewById(R.id.editTextDate);
        Bundle info = getIntent().getExtras();

        edt1_1.setText(info.getString("Nombre"));
        editTextDate.setText(info.getString("Fecha nacimiento"));
    }
}
