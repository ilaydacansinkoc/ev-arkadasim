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


public class SignUpAsHouseholderHelper extends Activity {

    private EditText rentamount;
    private EditText numberofstudentslivingathome;
    private EditText numberofpeopletostayathome;
    private EditText dues;
    private RadioButton esyali;
    private RadioButton esyasiz;
    private EditText numberofrooms;
    private EditText heatingtype;
    private EditText internetconnection;
    private EditText location;
    private EditText genderofhouseholders;
    private EditText smokingstatus;
    private EditText haspet;

    String str_householder_butce;
    String str_householder_smokingStatus;
    String str_householder_numberOfPeopleInHouse;
    String str_householder_numberOfPeopleLookingFor;
    String str_householder_aidat;
    String str_householder_esyali;
    String str_householder_esyasiz;
    String str_householder_numberOfRooms;
    String str_householder_heatingType;
    String str_householder_internetConnection;
    String str_householder_location;
    String str_householder_genderOfHousemates;
    String str_householder_hasPet;


    Context ctx=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evarkadasiarayan2);

        rentamount =(EditText) findViewById(R.id.montly_price);
        numberofstudentslivingathome =(EditText)findViewById(R.id.number_of_people_in_house);
        numberofpeopletostayathome =(EditText)findViewById(R.id.number_of_people_lookingfor);
        dues =(EditText)findViewById(R.id.aidat);
        esyali=(RadioButton)findViewById(R.id.esyali_radiobutton);
        esyasiz=(RadioButton)findViewById(R.id.esyasiz_radiobutton);
        numberofrooms =(EditText)findViewById(R.id.number_of_rooms);
        heatingtype =(EditText)findViewById(R.id.heating_type);
        internetconnection =(EditText)findViewById(R.id.internet_connection);
        location=(EditText)findViewById(R.id.location);
        genderofhouseholders =(EditText)findViewById(R.id.genders_of_housemates);
        smokingstatus=(EditText)findViewById(R.id.smoking_status);
        haspet=(EditText)findViewById(R.id.has_pet);

    }


    public void onHouseHolderSignUpCompletedClick(View view){

        str_householder_butce= rentamount.getText().toString();
        str_householder_numberOfPeopleInHouse= numberofstudentslivingathome.getText().toString();
        str_householder_numberOfPeopleLookingFor= numberofpeopletostayathome.getText().toString();
        str_householder_aidat= dues.getText().toString();
        str_householder_esyali=esyali.getText().toString();
        str_householder_esyasiz=esyasiz.getText().toString();
        str_householder_numberOfRooms= numberofrooms.getText().toString();
        str_householder_heatingType= heatingtype.getText().toString();
        str_householder_internetConnection= internetconnection.getText().toString();
        str_householder_location=location.getText().toString();
        str_householder_genderOfHousemates= genderofhouseholders.getText().toString();
        str_householder_smokingStatus= smokingstatus.getText().toString();
        str_householder_hasPet=haspet.getText().toString();



        startActivity(new Intent(this, MainActivity.class));

        BackGround b = new BackGround();
        b.execute(str_householder_butce,
                    str_householder_numberOfPeopleInHouse,
                    str_householder_numberOfPeopleLookingFor,
                    str_householder_aidat,
                    str_householder_numberOfRooms,
                    str_householder_heatingType,
                    str_householder_internetConnection,
                    str_householder_location,
                    str_householder_genderOfHousemates,
                    str_householder_smokingStatus,
                    str_householder_hasPet);

    }
    class BackGround extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            String rentamount = params[0];
            String numberofstudentslivingathome = params[1];
            String numberofpeopletostayathome = params[2];
            String dues = params[3];
            String numberofrooms = params[4];
            String heatingtype = params[5];
            String internetconnection = params[6];
            String location = params[7];
            String genderofhouseholders = params[8];
            String smokingstatus = params[9];
            String haspet = params[10];


            String data="";
            int tmp;

            try {
                URL url = new URL("http://10.0.2.2/register2.php");

                String urlParams =
                                "rentamount="+rentamount
                                +"&numberofstudentslivingathome="+numberofstudentslivingathome
                                +"&numberofpeopletostayathome="+numberofpeopletostayathome
                                +"&dues="+dues
                                +"&numberofrooms="+numberofrooms
                                +"&heatingtype="+heatingtype
                                +"&internetconnection="+internetconnection
                                +"&location="+location
                                +"&genderofhouseholders="+genderofhouseholders
                                +"&smokingstatus="+smokingstatus
                                +"&haspet="+haspet;


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
