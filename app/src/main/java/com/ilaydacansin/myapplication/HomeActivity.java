package com.ilaydacansin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {

    String username, password,email,ownertype;

    TextView usernameTV,emailTV,passwordTV,usertypeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        username= getIntent().getStringExtra("username");
        password= getIntent().getStringExtra("password");
        email= getIntent().getStringExtra("mailadress");
        ownertype=getIntent().getStringExtra("ownertype");

        if("house_mate".equals(ownertype)){
            setContentView(R.layout.housemate_view_of_main_screen_layout);
            startActivity(new Intent(getApplicationContext(), HousemateViewOfMainScreenActivity.class));

        }

        usernameTV=(TextView) findViewById(R.id.mainscreen_username);
        emailTV=(TextView) findViewById(R.id.mainscreen_mailaddress);
        passwordTV=(TextView) findViewById(R.id.mainscreen_password);
        usertypeTV=(TextView) findViewById(R.id.mainscreen_usertype);


        if("house_mate".equals(ownertype)){
            usertypeTV.setText("Kullanıcı tipin - Ev arayan");
        }else if("house_owner".equals(ownertype)){
            usertypeTV.setText("Kullanıcı tipin - Ev sahibi");
        }
        usernameTV.setText("Hoşgeldin "+username+"!");
        passwordTV.setText("Şifren "+password);
        emailTV.setText("Mail adresin "+email);



    }
}
