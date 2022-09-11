package com.example.convertyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public void Convert(View view){

    EditText editText = findViewById(R.id.edittext1);
    String lei = editText.getText().toString();
    double leiconvert = Double.parseDouble(lei);
    double euroconve = leiconvert * 19.44;

    Toast.makeText(this,euroconve+" Lei" , Toast.LENGTH_SHORT).show();
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}