package com.example.projectxxx;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.projectxxx.LoginPackages.WelcomeActivity;
import com.example.projectxxx.QuestionPackages.QuestionMainFragment;
import com.example.projectxxx.RatingPackages.RatingMainFragment;
import com.google.firebase.auth.FirebaseUser;

/**
 Документация и обозначения:
        user-пользователь
 *
 **/

public class MainActivity extends AppCompatActivity {
     FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(user==null){
            Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
            startActivity(intent);
            finish();
        }else{
            Intent intent=new Intent(MainActivity.this,MainActivitySecond.class);
            startActivity(intent);
            finish();
        }




    }




}
