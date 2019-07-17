package com.aptechprojectsem3.currencyconverter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpalshActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Boolean timeCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);

        timeCheck = sharedPreferences.getBoolean("timeCheck", true);





        if(timeCheck) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    timeCheck = false;
                    editor.putBoolean("timeCheck", timeCheck);
                    editor.apply();

                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }, 3000);

        }else {

            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
            finish();

        }
    }
}
