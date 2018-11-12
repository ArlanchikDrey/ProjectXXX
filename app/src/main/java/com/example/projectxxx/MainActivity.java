package com.example.projectxxx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.projectxxx.fragments.FragmentMain;

/**
 Документация и обозначения:
        user-пользователь
 *
 **/

public class MainActivity  extends AppCompatActivity {
    //FirebaseUser  user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, FragmentMain.newInstance())
                .commit();

//        if(user==null){
//            Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
//            startActivity(intent);
//            finish();
//        }else{
//            Intent intent=new Intent(MainActivity.this,MainActivitySecond.class);
//            startActivity(intent);
//            finish();
//        }




    }




}
