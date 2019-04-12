package com.example.vahid.fragment2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.btn_a);
        btnTwo = (Button) findViewById(R.id.btn_b);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BlankFragment frg1 = new BlankFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frg_holder, frg1);
                ft.commit();

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BlankFragment2 frg2 = new BlankFragment2();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frg_holder, frg2);
                ft.commit();

            }
        });


    }
}
