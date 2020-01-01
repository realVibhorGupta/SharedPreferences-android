package com.example.vibhor.sharedpreferencesappdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void onSave(View view)
    {


        SharedPreferences sharedPreferences=getSharedPreferences("My Data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name", username.getText().toString());
        editor.putString("password" , password.getText().toString());
        editor.apply();

        Toast.makeText(MainActivity.this,"Your  Data has been Saved" , Toast.LENGTH_LONG).show();
    }


    public void onNext(View  view)
    {
        Toast.makeText(MainActivity.this,"Next" , Toast.LENGTH_LONG).show();
        Intent intent=new Intent(MainActivity.this,ActivityB.class);
        startActivity(intent);
    }
}
