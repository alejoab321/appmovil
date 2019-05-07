package com.example.minitwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    TextView tvGoSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        //Cuando le damos la opcion this, seleccionamos la opcion Make... y seleccionamos onClick
        btnLogin.setOnClickListener(this);

        tvGoSignUp = findViewById(R.id.textViewGoSignUp);
        tvGoSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.buttonLogin:
                break;
            case R.id.textViewGoSignUp:
                goToSignUp();
                break;
        }
    }

    private void goToSignUp() {
        Intent i = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(i);
        finish();
    }
}
