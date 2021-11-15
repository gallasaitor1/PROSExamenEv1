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

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        int candidatos = 0;

        EditText edt1_1 = (EditText) findViewById(R.id.edt1_1);
        EditText editTextDate = (EditText) findViewById(R.id.editTextDate);
        Spinner spin1_1 = (Spinner) findViewById(R.id.spin1_1);
        RadioButton radio1_1 = (RadioButton) findViewById(R.id.radio1_1);
        RadioButton radio1_2 = (RadioButton) findViewById(R.id.radio1_2);
        CheckBox chk1_1 = (CheckBox) findViewById(R.id.chk1_1);
        CheckBox chk1_2 = (CheckBox) findViewById(R.id.chk1_2);
        CheckBox chk1_3 = (CheckBox) findViewById(R.id.chk1_3);
        CheckBox chk1_4 = (CheckBox) findViewById(R.id.chk1_4);
        Button btn1 = (Button) findViewById(R.id.btn1);
        TextView txt1_8 = (TextView) findViewById(R.id.txt1_8);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.provincias_spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1_1.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener(){
            private int Bundle;

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activity1.this, Activity1Validar.class);

                String nombre = edt1_1.getText().toString();
                String fecha = editTextDate.getText().toString();

                startActivityForResult(intent1,Bundle);




    }
});}}
