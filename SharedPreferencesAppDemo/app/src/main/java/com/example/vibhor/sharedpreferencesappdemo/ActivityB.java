package com.example.vibhor.sharedpreferencesappdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
    public static final String DEFAULT = "N/A";
    TextView usernameTextView,passwordTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        usernameTextView = (TextView) findViewById(R.id.textView2);
        passwordTextView = (TextView) findViewById(R.id.textView4);
    }

    public void onLoad(View view)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("My Data", Context.MODE_PRIVATE);
        String name= sharedPreferences.getString("name", DEFAULT);
        String password = sharedPreferences.getString("password", DEFAULT);

        if(name.equals(DEFAULT) || password.equals(DEFAULT))
        {
            Toast.makeText(this,"Data not Found" , Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Data loaded Successfully" , Toast.LENGTH_LONG).show();
            usernameTextView.setText(name);
            passwordTextView.setText(password);
        }

    }


    public void onPrevious(View view)
    {
        Toast.makeText(this,"previous",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
