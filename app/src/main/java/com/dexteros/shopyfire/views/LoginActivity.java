package com.dexteros.shopyfire.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dexteros.shopyfire.R;

import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}
