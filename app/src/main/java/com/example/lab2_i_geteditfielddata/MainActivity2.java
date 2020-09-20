package com.example.lab2_i_geteditfielddata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView TV1, TV2;
    String usernameText, idText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        usernameText = intent.getStringExtra("Hello "+"EXTRA_TEXT");
        idText = intent.getStringExtra("With an ID: "+"EXTRA_Number");

        TV1 = (TextView) findViewById(R.id.mssg1);
        TV2 = (TextView) findViewById(R.id.mssg2);

        TV1.setText(usernameText);
        TV2.setText(idText);
    }
}
