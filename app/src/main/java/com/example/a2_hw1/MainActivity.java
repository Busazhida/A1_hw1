package com.example.a2_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText passwordText, loginText;
    TextView changeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordText = findViewById(R.id.password);
        loginText = findViewById(R.id.login);
        changeView = findViewById(R.id.change);

    }

    public void click(View view) {

        if (passwordText.length() != 0 && passwordText.length() <10) {

            changeView.setText("Success!");


            if (passwordText.length() > 10) {

                passwordText.setError("There is a limit");
                changeView.setText("Wrong information");


            }


        } else if (passwordText.length() == 0) {

            changeView.setText("Wrong information!");


            passwordText.setError("Insert password");


            if (loginText.length() != 0 ) {

                changeView.setText("true");


                if (loginText.length() > 10) {

                    loginText.setError("There is a limit");
                    changeView.setText("Wrong information!");


                }


            } else if (loginText.length() == 0) {

                changeView.setText("Wrong information!");


                loginText.setError("Success!");
            }


        }
    }



}