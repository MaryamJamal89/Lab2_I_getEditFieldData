package com.example.lab2_i_geteditfielddata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String user_name, id_, message;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick();
            }
        });
    }

    public void onButtonClick(){
        EditText username = (EditText)findViewById(R.id.user);
        user_name = username.getText().toString();

        EditText id = (EditText)findViewById(R.id.id);
        id_ = id.getText().toString();

        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("EXTRA_TEXT",user_name);
        i.putExtra("EXTRA_Number",id_);
        startActivity(i);
    }

    public void onStart(){
        super.onStart();
        Log.d(message,"onStart() Method");
        Toast.makeText(MainActivity.this,"Started..",Toast.LENGTH_LONG).show();
    }

    public void onRestart(){
        super.onRestart();
        Log.d(message,"onRestrart() Method");
        Toast.makeText(MainActivity.this,"Restarted..",Toast.LENGTH_LONG).show();
    }

    public void onResume(){
        super.onResume();
        Log.d(message,"onResume() Method");
        Toast.makeText(MainActivity.this,"Resumed..",Toast.LENGTH_LONG).show();
    }

    public void onPause(){
        super.onPause();
        Log.d(message,"onPause() Method");
        Toast.makeText(MainActivity.this,"Paused..",Toast.LENGTH_LONG).show();
    }

    public void onStop(){
        super.onStop();
        Log.d(message,"onStop() Method");
        Toast.makeText(MainActivity.this,"Stopped..",Toast.LENGTH_LONG).show();
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(message,"onDestroy() Method");
        Toast.makeText(MainActivity.this,"Destroy..",Toast.LENGTH_LONG).show();
    }

}
