package com.ilaydacansin.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    String Username, Password;
    Context ctx=this;
    String USERNAME, PASSWORD, MAILADRESS,OWNERTYPE;
    String owner_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        owner_type="";
    }

    public void goSignUpActivity(View view) {
        startActivity(new Intent(this, SignUpSelectionActivity.class));
    }

    public void main_login_as_houseowner(View v){
        Username = username.getText().toString();
        Password = password.getText().toString();
        String Url = "http://10.0.2.2/login.php";
        owner_type = "house_owner";


        BackGround b = new BackGround();
        b.execute(Username, Password,Url,owner_type);
    }

    public void main_login_as_housemate(View v){
        Username = username.getText().toString();
        Password = password.getText().toString();
        String Url = "http://10.0.2.2/login2.php";
        owner_type = "house_mate";



        BackGround b = new BackGround();
        b.execute(Username, Password,Url,owner_type);



    }

    class BackGround extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            String username = params[0];
            String password = params[1];
            String url_l = params[2];
            String owner_type= params[3];
            System.out.println("url is"+url_l);
            String data="";
            int tmp;

            try {
                URL url = new URL(url_l);
                System.out.println("url is "+url_l);
                String urlParams = "username="+username+"&password="+password;

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
            String err = null;
            try {
                JSONObject root = new JSONObject(s);
                String owner_typ = owner_type;
                JSONObject house_owner = root.getJSONObject(owner_typ);
                USERNAME = house_owner.getString("username");
                PASSWORD = house_owner.getString("password");
                MAILADRESS = house_owner.getString("mailadress");
                OWNERTYPE = owner_type;
                System.out.println("OwnerType is " + OWNERTYPE);

            } catch (JSONException e) {
                e.printStackTrace();
                err = "Exception: " + e.getMessage();
            }

            if ("house_mate".equals(owner_type)) {
                housemate_intent_setter();
            }else if("house_owner".equals(owner_type)){
                houseowner_intent_setter();
            }

        }

        private void housemate_intent_setter(){
            Intent i = new Intent(ctx, HousemateViewOfMainScreenActivity.class);
            i.putExtra("username", USERNAME);
            i.putExtra("password", PASSWORD);
            i.putExtra("ownertype", OWNERTYPE);
            i.putExtra("mailadress", MAILADRESS);

            startActivity(i);
        }

        private void houseowner_intent_setter(){
            Intent i = new Intent(ctx, HouseOwnerViewOfMainScreenActivity.class);
            i.putExtra("username", USERNAME);
            i.putExtra("password", PASSWORD);
            i.putExtra("ownertype", OWNERTYPE);
            i.putExtra("mailadress", MAILADRESS);

            startActivity(i);
        }
    }





}
