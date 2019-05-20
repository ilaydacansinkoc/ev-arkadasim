package com.ilaydacansin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SignUpAsHouseholderActivity extends Activity {

    private EditText username;
    private EditText password;
    private EditText nameSurname;
    private EditText age;
    private EditText mailadress;
    private EditText majority;
    private RadioButton lisans;
    private RadioButton yukseklisans;
    private RadioButton doktora;
    private EditText phoneNumber;

    String str_householder_username;
    String str_householder_password;
    String str_householder_nameSurname;
    String str_householder_age;
    String str_householder_emailAddress;
    String str_householder_majority;
    String str_householder_lisans;
    String str_householder_yukseklisans;
    String str_householder_doktora;
    String str_householder_phoneNumber;

    Context ctx=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evarkadasiarayan);

        username=(EditText) findViewById(R.id.username_signup);
        password=(EditText) findViewById(R.id.password_signup);
        nameSurname=(EditText) findViewById(R.id.namesurname_signup);
        age=(EditText) findViewById(R.id.age_signup);
        mailadress =(EditText) findViewById(R.id.email_signup);
        majority=(EditText) findViewById(R.id.major_signup);
        lisans=(RadioButton) findViewById(R.id.lisans_signup);
        yukseklisans=(RadioButton) findViewById(R.id.yukseklisans_signup);
        doktora=(RadioButton) findViewById(R.id.doktora_signup);
        phoneNumber=(EditText) findViewById(R.id.phoneno_signup);


    }

    public void onHouseholderNextButtonClick(View view){

        str_householder_username=username.getText().toString();
        str_householder_password=password.getText().toString();
        str_householder_nameSurname=nameSurname.getText().toString();
        str_householder_age=age.getText().toString();
        str_householder_emailAddress= mailadress.getText().toString();
        str_householder_majority=majority.getText().toString();
        str_householder_lisans=lisans.getText().toString();
        str_householder_yukseklisans=yukseklisans.getText().toString();
        str_householder_doktora=doktora.getText().toString();
        str_householder_phoneNumber=phoneNumber.getText().toString();


        Degree degree=null;
        if(lisans.isSelected()){
            degree=Degree.BACHELOR;
            str_householder_lisans=Degree.BACHELOR.toString();
        }else if(yukseklisans.isSelected()){
            degree=Degree.MASTER;
            str_householder_yukseklisans=Degree.MASTER.toString();
        }else if(doktora.isSelected()){
            degree=Degree.PHD;
            str_householder_doktora=Degree.PHD.toString();
        }


        startActivity(new Intent(this, SignUpAsHouseholderHelper.class));

        Toast.makeText(this,"username (householder) "+str_householder_username,Toast.LENGTH_LONG).show();

        BackGround b = new BackGround();
        b.execute(str_householder_username,
                str_householder_password,
                str_householder_nameSurname,
                str_householder_majority,
                str_householder_age,
                str_householder_emailAddress,
                str_householder_phoneNumber);

    }

    class BackGround extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            String username = params[0];
            String password = params[1];
            String name = params[2];
            String department = params[3];
            String age = params[4];
            String mailadress = params[5];
            String phonenumber = params[6];



            String data="";
            int tmp;

            try {
                URL url = new URL("http://10.0.2.2/register.php");

                String urlParams =
                        "username="+username+
                        "&password="+password+
                        "&name="+name+"&department="+department+"&age="+age
                        +"&mailadress="+mailadress
                        +"&phonenumber="+phonenumber;


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
