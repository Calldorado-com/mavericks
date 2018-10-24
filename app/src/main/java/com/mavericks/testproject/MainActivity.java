package com.mavericks.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.calldorado.Calldorado;
import com.calldorado.manual_search.CDOPhoneNumber;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        setContentView(R.layout.activity_main);
    }

    public void onSettings(View view) {
        Calldorado.createCalldoradoSettingsActivity(this);
    }

    public void onSearch(View view) {
        Calldorado.search(this, new CDOPhoneNumber("1111"));
    }

    public void onStart(View view) {
        Calldorado.startCalldorado(this, null, savedInstanceState, new Calldorado.CalldoradoFullCallback() {
            @Override
            public void onInitDone(boolean b, String[] strings, int[] ints) {
                Toast.makeText(MainActivity.this, "Calldorado ready!", Toast.LENGTH_SHORT).show();
            }
        });
        Calldorado.setCustomSettingsFeatures(this, true, true, false, false, true, true, false, false, true, true, false);
        Calldorado.setCalldoradoAftercallColors(this,
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.light_grey),
                getResources().getColor(R.color.black)
        );
    }
}
