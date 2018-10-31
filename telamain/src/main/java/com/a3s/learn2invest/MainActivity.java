package com.a3s.learn2invest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayDeque;

public class MainActivity extends AppCompatActivity {

    Spinner Spinner;
    String[] SPINNERVALUES = {"CDB","LCI","LCA"};
    String SpinnerValue;
    Button Button1;
    Intent intent;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner = (Spinner) findViewById(R.id.spinnerId);
        Button1 = (Button)findViewById(R.id.button1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.escolha_usuario,
                android.R.layout.simple_spinner_item);

        Spinner.setAdapter(adapter);

        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String)Spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(SpinnerValue){

                    case "CDB":
                        intent = new Intent(MainActivity.this, CDBActivity.class);
                        startActivity(intent);
                        break;

                    case "LCI":
                        intent = new Intent(MainActivity.this, LCI.class);
                        startActivity(intent);
                        break;


                }
            }
        });

    }
}



