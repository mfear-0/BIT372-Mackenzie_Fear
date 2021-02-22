package com.example.unitcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import com.example.unitcoverter.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LiveData ld = new LiveData("");
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        binding.setInputLd(ld);

        Button fbtn = findViewById(R.id.convert_btn);
        EditText finput = findViewById(R.id.fahrenheit_input);
        TextView ctxt = findViewById(R.id.celcius_text);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.conv_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String spItem = spinner.getItemAtPosition(position).toString();

                if(spItem.equals("F to C")){
                    fbtn.setOnClickListener(v -> {
                        if (finput.getText().length() == 0)
                            return;
                        double celsius = Converter.toCelsius(Float.parseFloat(finput.getText().toString()));
                        ctxt.setText(String.format("ºF is equal to %.2f ºC", celsius));
                    });
                }
                else if(spItem.equals("lb to kg")){
                    fbtn.setOnClickListener(v -> {
                        if (finput.getText().length() == 0)
                            return;
                        double celsius = Converter.toKilos(Float.parseFloat(finput.getText().toString()));
                        ctxt.setText(String.format("lbs is equal to %.2f kg", celsius));
                    });
                }
                else if(spItem.equals("mi to km")){
                    fbtn.setOnClickListener(v -> {
                        if (finput.getText().length() == 0)
                            return;
                        double celsius = Converter.toKm(Float.parseFloat(finput.getText().toString()));
                        ctxt.setText(String.format("miles is equal to %.2f km", celsius));
                    });
                }
                else if(spItem.equals("oz to ml")){
                    fbtn.setOnClickListener(v -> {
                        if (finput.getText().length() == 0)
                            return;
                        double celsius = Converter.toMls(Float.parseFloat(finput.getText().toString()));
                        ctxt.setText(String.format("ounces is equal to %.2f ml", celsius));
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }
}