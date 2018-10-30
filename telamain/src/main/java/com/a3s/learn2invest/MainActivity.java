package com.a3s.learn2invest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayDeque;

public class MainActivity extends AppCompatActivity {

    Spinner Spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner = (Spinner) findViewById(R.id.spinnerId);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.escolha_usuario,
                android.R.layout.simple_spinner_item);

        Spinner.setAdapter(adapter);
        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent = null;
                switch(position){
                    case 1:
                        intent = new Intent(MainActivity.this, CDBActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, LCI.class);
                        break;

                }
                startActivity(intent);

            }

            });


}

}