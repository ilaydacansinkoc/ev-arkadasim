package com.ilaydacansin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SignUpAsHomemateActivity extends Activity {

    private EditText username;
    private EditText password;
    private EditText nameSurname;
    private EditText age;
    private EditText emailAddress;
    private EditText majority;
    private RadioButton lisans;
    private RadioButton yukseklisans;
    private RadioButton doktora;
    private EditText phoneNumber;
    private EditText butce;
    private EditText smokingStatus;
    private Button completeButton;


    Context ctx=this;

    String str_username;
    String str_password;
    String str_nameSurname;
    String str_age;
    String str_emailAddress;
    String str_majority;
    String str_phoneNumber;
    String str_butce;
    String str_smokingStatus;
    String str_lisans_rb;
    String str_yukseklisans_rb;
    String str_doktora_rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.evarayan);


        username=(EditText) findViewById(R.id.homemate_username_signup);
        password=(EditText) findViewById(R.id.homemate_password_signup);
        nameSurname=(EditText) findViewById(R.id.name_surname_hommate_signup);
        age=(EditText) findViewById(R.id.age_homemate_signup);
        emailAddress=(EditText) findViewById(R.id.email_homemate_signup);
        majority=(EditText) findViewById(R.id.majority_hommate_signup);
        phoneNumber=(EditText) findViewById(R.id.phoneno_homemate_signup);
        butce=(EditText) findViewById(R.id.butce_homemate_signup);
        smokingStatus=(EditText) findViewById(R.id.smokingstatus_homemate_signup);
        lisans=(RadioButton) findViewById(R.id.lisans_homemate_signup);
        yukseklisans=(RadioButton) findViewById(R.id.yukseklisans_homemate_signup);
        doktora=(RadioButton) findViewById(R.id.doktora_homemate_signup);

    }

    public void onHomemateSignUp(View view){
        str_username=username.getText().toString();
        str_password=password.getText().toString();
        str_nameSurname=nameSurname.getText().toString();
        str_majority=majority.getText().toString();
        str_age=age.getText().toString();
        str_emailAddress=emailAddress.getText().toString();
        str_phoneNumber=phoneNumber.getText().toString();
        str_butce=butce.getText().toString();
        str_smokingStatus=smokingStatus.getText().toString();

        int budget=Integer.parseInt(str_butce);
        int age= Integer.parseInt(str_age);

        Degree degree=null;
        if(lisans.isSelected()){
            degree=Degree.BACHELOR;
            str_lisans_rb=Degree.BACHELOR.toString();
        }else if(yukseklisans.isSelected()){
            degree=Degree.MASTER;
            str_yukseklisans_rb=Degree.MASTER.toString();
        }else if(doktora.isSelected()){
            degree=Degree.PHD;
            str_doktora_rb=Degree.PHD.toString();
        }



        Toast.makeText(this,"username (homemate) "+str_username,Toast.LENGTH_LONG).show();

        startActivity(new Intent(this, MainActivity.class));

        BackGround b = new BackGround();
        b.execute(str_username,
                str_password,
                str_nameSurname,
                str_majority,
                str_age,
                str_emailAddress,
                str_phoneNumber,
                str_butce,
                str_smokingStatus);
    }

    class BackGround extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            String username = params[0];
            String password = params[1];
            String name = params[2];
            String department = params[3];
            String age = params[4];
            Integer age_int = Integer.parseInt(age);
            String mailadress = params[5];
            String phonenumber = params[6];
            String budget = params[7];
            Integer budget_int=Integer.parseInt(budget);
            String smokingstatus = params[8];

            Homemate homemate= new Homemate(username,password,name,
                    department,null,age_int,mailadress,phonenumber,
                    budget_int,smokingstatus);



            String data="";
            int tmp;

            try {
                URL url = new URL("http://10.0.2.2/register3.php");

                String urlParams =
                                "username="+username
                                +"&password="+password
                                +"&name="+name
                                +"&department="+department
                                +"&age="+age
                                +"&mailadress="+mailadress
                                +"&phonenumber="+phonenumber
                                +"&budget="+budget
                                +"&smokingstatus="+smokingstatus;


                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoOutput(true);
                OutputStream os = httpURLConnection.getOutputStream();
                os.write(urlParams.getBytes());
                os.flush();
                os.close();

                InputStream is = httpURLConnection.getInputStream();
                while((tmp=is.read())!=-1){
                    data+= (char)tmp;
                }

                is.close();
                httpURLConnection.disconnect();
                return data;

            } catch (MalformedURLException e) {
                e.printStackTrace();
                return "Exception: "+e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "Exception: "+e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String s) {
            if(s.equals("")){
                s="Data saved successfully.";
            }
            Toast.makeText(ctx, s, Toast.LENGTH_LONG).show();
        }
    }


}
