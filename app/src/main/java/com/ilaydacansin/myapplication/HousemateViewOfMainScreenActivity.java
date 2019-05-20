package com.ilaydacansin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HousemateViewOfMainScreenActivity extends AppCompatActivity {

    View view1;
    View view2;
    View view3;
    int count;

    TextView ev_ilani_num_1,ev_ilani_num_2,ev_ilani_num_3;
    TextView rent_amount_text_1,rent_amount_text_2,rent_amount_text_3;
    TextView num_of_students_living_at_home_1,num_of_students_living_at_home_2,num_of_students_living_at_home_3;
    TextView num_of_students_looking_for_home_1,num_of_students_looking_for_home_2,num_of_students_looking_for_home_3;
    TextView budget_1,budget_2,budget_3;
    TextView num_of_rooms_1,num_of_rooms_2,num_of_rooms_3;
    TextView heating_type_1,heating_type_2,heating_type_3;
    TextView internet_1,internet_2,internet_3 ;
    TextView location_1,location_2,location_3;
    TextView gender_1,gender_2,gender_3;
    TextView smoking_status_1,smoking_status_2,smoking_status_3 ;
    TextView pet_1,pet_2,pet_3;
    TextView houseowner_name_1,houseowner_name_2,houseowner_name_3 ;
    TextView houseowner_dept_1,houseowner_dept_2,houseowner_dept_3;
    TextView houseowner_age_1,houseowner_age_2,houseowner_age_3;
    TextView houseowner_mail_1,houseowner_mail_2,houseowner_mail_3;
    TextView houseowner_phone_num_1,houseowner_phone_num_2,houseowner_phone_num_3;


    String username, password,email,ownertype;
    TextView usernameTV,emailTV,passwordTV,usertypeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.housemate_view_of_main_screen_layout);

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



        count = 1;

        view1 = findViewById(R.id.ev_ilani_1);

        ev_ilani_num_1 =view1.findViewById(R.id.entries_layout_of_homemate_view_house_number);
        rent_amount_text_1 = view1.findViewById(R.id.rentamout_int_homemate_view);
        num_of_students_living_at_home_1 = view1.findViewById(R.id.num_of_students_living_at_home_int_homemate_view);
        num_of_students_looking_for_home_1 = view1.findViewById(R.id.num_of_students_looking_for_home_int_homemate_view);
        budget_1 = view1.findViewById(R.id.budget_int_homemate_view);
        num_of_rooms_1 = view1.findViewById(R.id.room_number_int_homemate_view);
        heating_type_1 = view1.findViewById(R.id.heating_type_text_homemate_view);
        internet_1 = view1.findViewById(R.id.internet_text_homemate_view);
        location_1 = view1.findViewById(R.id.location_text_homemate_view);
        gender_1 = view1.findViewById(R.id.gender_text_homemate_view);
        smoking_status_1 = view1.findViewById(R.id.smoking_status_text_homemate_view);
        pet_1 = view1.findViewById(R.id.pet_text_homemate_view);
        houseowner_name_1 = view1.findViewById(R.id.houseowner_text_homemate_view);
        houseowner_dept_1 = view1.findViewById(R.id.houseowner_department_text_homemate_view);
        houseowner_age_1 = view1.findViewById(R.id.houseowner_age_text_homemate_view);
        houseowner_mail_1 = view1.findViewById(R.id.houseowner_mail_text_homemate_view);
        houseowner_phone_num_1 = view1.findViewById(R.id.houseowner_phonenumber_text_homemate_view);

        ev_ilani_num_1.setText("Ev ilanı #" + count);
        rent_amount_text_1.setText("200 TL");
        num_of_students_living_at_home_1.setText("3");
        num_of_students_looking_for_home_1.setText("1");
        budget_1.setText("20TL");
        num_of_rooms_1.setText("5");
        heating_type_1.setText("Klima");
        internet_1.setText("Wifi");
        location_1.setText("Gülbahce");
        gender_1.setText("Kadin");
        smoking_status_1.setText("Icmiyoruz");
        pet_1.setText("Kedi beslenebilir");
        houseowner_name_1.setText("Cansın Koç");
        houseowner_dept_1.setText("bilgisayar");
        houseowner_age_1.setText("22");
        houseowner_mail_1.setText("cansinkoc@gmail.com");
        houseowner_phone_num_1.setText("1234567");


        count++;

        view2 = findViewById(R.id.ev_ilani_2);


        ev_ilani_num_2 = view2.findViewById(R.id.entries_layout_of_homemate_view_house_number);
        rent_amount_text_2 = view2.findViewById(R.id.rentamout_int_homemate_view);
        num_of_students_living_at_home_2 = view2.findViewById(R.id.num_of_students_living_at_home_int_homemate_view);
        num_of_students_looking_for_home_2 = view2.findViewById(R.id.num_of_students_looking_for_home_int_homemate_view);
        budget_2 = view2.findViewById(R.id.budget_int_homemate_view);
        num_of_rooms_2 = view2.findViewById(R.id.room_number_int_homemate_view);
        heating_type_2 = view2.findViewById(R.id.heating_type_text_homemate_view);
        internet_2 = view2.findViewById(R.id.internet_text_homemate_view);
        location_2 = view2.findViewById(R.id.location_text_homemate_view);
        gender_2 = view2.findViewById(R.id.gender_text_homemate_view);
        smoking_status_2 = view2.findViewById(R.id.smoking_status_text_homemate_view);
        pet_2 =view2.findViewById(R.id.pet_text_homemate_view);
        houseowner_name_2 = view2.findViewById(R.id.houseowner_text_homemate_view);
        houseowner_dept_2 = view2.findViewById(R.id.houseowner_department_text_homemate_view);
        houseowner_age_2 = view2.findViewById(R.id.houseowner_age_text_homemate_view);
        houseowner_mail_2 = view2.findViewById(R.id.houseowner_mail_text_homemate_view);
        houseowner_phone_num_2 = view2.findViewById(R.id.houseowner_phonenumber_text_homemate_view);

        ev_ilani_num_2.setText("Ev ilanı #"+count);
        rent_amount_text_2.setText("450 TL");
        num_of_students_living_at_home_2.setText("2");
        num_of_students_looking_for_home_2.setText("1");
        budget_2.setText("20 TL");
        num_of_rooms_2.setText("2");
        heating_type_2.setText("Klima");
        internet_2.setText("WiFi");
        location_2.setText("Gülbahçe Calipso'nun karşısında");
        gender_2.setText("Kadın");
        smoking_status_2.setText("İçmiyoruz");
        pet_2.setText("Köpek beslenebilir");
        houseowner_name_2.setText("Selen Coşkun");
        houseowner_dept_2.setText("Bilgisayar Mühendisliği");
        houseowner_age_2.setText("22");
        houseowner_mail_2.setText("sln@sln.com");
        houseowner_phone_num_2.setText("5551231111");

        count++;

        view3 = findViewById(R.id.ev_ilani_3);

        ev_ilani_num_3= view3.findViewById(R.id.entries_layout_of_homemate_view_house_number);
        rent_amount_text_3 = view3.findViewById(R.id.rentamout_int_homemate_view);
        num_of_students_living_at_home_3 = view3.findViewById(R.id.num_of_students_living_at_home_int_homemate_view);
        num_of_students_looking_for_home_3= view3.findViewById(R.id.num_of_students_looking_for_home_int_homemate_view);
        budget_3= view3.findViewById(R.id.budget_int_homemate_view);
        num_of_rooms_3 = view3.findViewById(R.id.room_number_int_homemate_view);
        heating_type_3 = view3.findViewById(R.id.heating_type_text_homemate_view);
        internet_3 = view3.findViewById(R.id.internet_text_homemate_view);
        location_3 = view3.findViewById(R.id.location_text_homemate_view);
        gender_3= view3.findViewById(R.id.gender_text_homemate_view);
        smoking_status_3 =  view3.findViewById(R.id.smoking_status_text_homemate_view);
        pet_3= view3.findViewById(R.id.pet_text_homemate_view);
        houseowner_name_3 = view3.findViewById(R.id.houseowner_text_homemate_view);
        houseowner_dept_3 = view3.findViewById(R.id.houseowner_department_text_homemate_view);
        houseowner_age_3= view3.findViewById(R.id.houseowner_age_text_homemate_view);
        houseowner_mail_3  = view3.findViewById(R.id.houseowner_mail_text_homemate_view);
        houseowner_phone_num_3 = view3.findViewById(R.id.houseowner_phonenumber_text_homemate_view);


        ev_ilani_num_3.setText("Ev ilanı #"+count);
        rent_amount_text_3.setText("1000 TL");
        num_of_students_living_at_home_3.setText("1");
        num_of_students_looking_for_home_3.setText("1");
        budget_3.setText("15 TL");
        num_of_rooms_3.setText("2");
        heating_type_3.setText("Klima");
        internet_3.setText("WiFi");
        location_3.setText("Gülbahçe köy meydanı");
        gender_3.setText("Kadın");
        smoking_status_3.setText("İçilebilir");
        pet_3.setText("Kedi beslenebilir");
        houseowner_name_3.setText("Nisa Pınar Rüzgar");
        houseowner_dept_3.setText("Bilgisayar Mühendisliği");
        houseowner_age_3.setText("22");
        houseowner_mail_3.setText("nisa@nisa.com");
        houseowner_phone_num_3.setText("5551234589");


       //int size = SignUpAsHouseholderHelper.houseArrayList.size();
       //int a=3;
       //for(int i=0;i<size;i++){
       //    LinearLayout relativeLayout = (LinearLayout) findViewById(R.id.ev_ilani_3);
       //    LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
       //    View myview = layoutInflater.inflate(R.layout.ev_ilani_layout,relativeLayout,false);
       //    relativeLayout.addView(myview);

       //}




    }

}
