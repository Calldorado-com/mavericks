package com.mavericks.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.calldorado.Calldorado;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calldorado.startCalldorado(this, savedInstanceState);
        Calldorado.setCalldoradoAftercallColors(this,
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.light_grey),
                getResources().getColor(R.color.black)
        );
    }
}
