package com.example.son.lab6tkgd;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai1 extends AppCompatActivity {
    Button btnChange1;
    Button btnChange2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        btnChange1=findViewById(R.id.btnRight11);
        btnChange2=findViewById(R.id.btnRight12);

        final FragmentManager fragmentManager=getSupportFragmentManager();
        Fragment11  fragment11=new Fragment11();
        final Fragment12 fragment12=new Fragment12();
//        fragmentManager.beginTransaction().add(R.id.fragment11, fragment11).commit();
        fragmentManager.beginTransaction().add(R.id.framlayout, fragment12).commit();
        btnChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment13 fragment13=new Fragment13();
                fragmentManager.beginTransaction().replace(R.id.framlayout,fragment13).commit();
            }
        });
        btnChange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.framlayout, fragment12).commit();
            }
        });

    }
}
