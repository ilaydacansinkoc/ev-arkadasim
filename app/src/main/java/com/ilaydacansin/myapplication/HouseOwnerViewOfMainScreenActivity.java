package com.ilaydacansin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HouseOwnerViewOfMainScreenActivity extends AppCompatActivity {

    String username, password,email,ownertype;
    TextView usernameTV,emailTV,passwordTV,usertypeTV;

    TextView ev_arkadasi_num_1,ev_arkadasi_num_2,ev_arkadasi_num_3;
    TextView ev_arkadasi_name_1,ev_arkadasi_name_2,ev_arkadasi_name_3;
    TextView ev_arkadasi_dept_1,ev_arkadasi_dept_2,ev_arkadasi_dept_3;
    TextView ev_arkadasi_age_1,ev_arkadasi_age_2,ev_arkadasi_age_3;
    TextView ev_arkadasi_mail_1,ev_arkadasi_mail_2,ev_arkadasi_mail_3;
    TextView ev_arkadasi_phone_1,ev_arkadasi_phone_2,ev_arkadasi_phone_3;
    TextView ev_arkadasi_budget_1,ev_arkadasi_budget_2,ev_arkadasi_budget_3;
    TextView ev_arkadasi_smokingstatus_1,ev_arkadasi_smokingstatus_2,ev_arkadasi_smokingstatus_3;

    View view1;
    View view2;
    View view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.houseowner_view_of_main_screen_layout);

        usernameTV=(TextView) findViewById(R.id.mainscreen_username);
        emailTV=(TextView) findViewById(R.id.mainscreen_mailaddress);
        passwordTV=(TextView) findViewById(R.id.mainscreen_password);
        usertypeTV=(TextView) findViewById(R.id.mainscreen_usertype);

        username= getIntent().getStringExtra("username");
        password= getIntent().getStringExtra("password");
        email= getIntent().getStringExtra("mailadress");
        ownertype=getIntent().getStringExtra("ownertype");

        if("house_mate".equals(ownertype)){
            usertypeTV.setText("Kullanıcı tipin - Ev arayan");
        }else if("house_owner".equals(ownertype)){
            usertypeTV.setText("Kullanıcı tipin - Ev sahibi");
        }
        usernameTV.setText("Hoşgeldin "+username+"!");
        passwordTV.setText("Şifren "+password);
        emailTV.setText("Mail adresin "+email);

        view1 = findViewById(R.id.ev_arkadasi_1);
        ev_arkadasi_num_1=view1.findViewById(R.id.entries_layout_of_houseowner_view_people_number);
        ev_arkadasi_name_1=view1.findViewById(R.id.housemate_name_text_houseowner_view);
        ev_arkadasi_dept_1=view1.findViewById(R.id.housemate_department_text_houseowner_view);
        ev_arkadasi_age_1=view1.findViewById(R.id.housemate_age_text_houseowner_view);
        ev_arkadasi_mail_1=view1.findViewById(R.id.housemate_mail_text_houseowner_view);
        ev_arkadasi_phone_1=view1.findViewById(R.id.housemate_phone_text_houseowner_view);
        ev_arkadasi_budget_1=view1.findViewById(R.id.housemate_budget_text_houseowner_view);
        ev_arkadasi_smokingstatus_1=findViewById(R.id.housemate_smokingstatus_text_houseowner_view);

        ev_arkadasi_num_1.setText("Ev arkadaşı #1");
        ev_arkadasi_name_1.setText("Selen Coskun");
        ev_arkadasi_dept_1.setText("bilgisayar");
        ev_arkadasi_age_1.setText("21");
        ev_arkadasi_mail_1.setText("selencoskun@gmail.com");
        ev_arkadasi_phone_1.setText("123456");
        ev_arkadasi_budget_1.setText("1000");
        ev_arkadasi_smokingstatus_1.setText("Kullanmiyorum");

        view2 = findViewById(R.id.ev_arkadasi_2);
        ev_arkadasi_num_2=view2.findViewById(R.id.entries_layout_of_houseowner_view_people_number);
        ev_arkadasi_name_2=view2.findViewById(R.id.housemate_name_text_houseowner_view);
        ev_arkadasi_dept_2=view2.findViewById(R.id.housemate_department_text_houseowner_view);
        ev_arkadasi_age_2=view2.findViewById(R.id.housemate_age_text_houseowner_view);
        ev_arkadasi_mail_2=view2.findViewById(R.id.housemate_mail_text_houseowner_view);
        ev_arkadasi_phone_2=view2.findViewById(R.id.housemate_phone_text_houseowner_view);
        ev_arkadasi_budget_2=view2.findViewById(R.id.housemate_budget_text_houseowner_view);
        ev_arkadasi_smokingstatus_2=findViewById(R.id.housemate_smokingstatus_text_houseowner_view);

        ev_arkadasi_num_2.setText("Ev arkadaşı #2");
        ev_arkadasi_name_2.setText("Reinhardt");
        ev_arkadasi_dept_2.setText("Uçak Mühendisliği");
        ev_arkadasi_age_2.setText("22");
        ev_arkadasi_mail_2.setText("rein@hardt.com");
        ev_arkadasi_phone_2.setText("5554441133");
        ev_arkadasi_budget_2.setText("1000TL ve 2000TL arası");
        ev_arkadasi_smokingstatus_2.setText("Sigara kullanmıyorum");

        view3 = findViewById(R.id.ev_arkadasi_3);
        ev_arkadasi_num_3=view3.findViewById(R.id.entries_layout_of_houseowner_view_people_number);
        ev_arkadasi_name_3=view3.findViewById(R.id.housemate_name_text_houseowner_view);
        ev_arkadasi_dept_3=view3.findViewById(R.id.housemate_department_text_houseowner_view);
        ev_arkadasi_age_3=view3.findViewById(R.id.housemate_age_text_houseowner_view);
        ev_arkadasi_mail_3=view3.findViewById(R.id.housemate_mail_text_houseowner_view);
        ev_arkadasi_phone_3=view3.findViewById(R.id.housemate_phone_text_houseowner_view);
        ev_arkadasi_budget_3=view3.findViewById(R.id.housemate_budget_text_houseowner_view);
        ev_arkadasi_smokingstatus_3=findViewById(R.id.housemate_smokingstatus_text_houseowner_view);

        ev_arkadasi_num_3.setText("Ev arkadaşı #3");
        ev_arkadasi_name_3.setText("Mei-Ling Zhou");
        ev_arkadasi_dept_3.setText("Fizik");
        ev_arkadasi_age_3.setText("22");
        ev_arkadasi_mail_3.setText("mei@zhou.com");
        ev_arkadasi_phone_3.setText("5554443333");
        ev_arkadasi_budget_3.setText("3000TL ve 4000TL arası verebilirim");
        ev_arkadasi_smokingstatus_3.setText("Sigara kullanmıyorum");


    }
}
