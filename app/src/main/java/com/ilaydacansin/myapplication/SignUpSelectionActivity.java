package com.ilaydacansin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void goHouseholderActivity(View view){
        startActivity(new Intent(this, SignUpAsHouseholderActivity.class));
    }

    public void goHomemateActivity(View view){
        startActivity(new Intent(this, SignUpAsHomemateActivity.class));
    }
}
