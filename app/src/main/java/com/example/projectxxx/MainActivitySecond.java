package com.example.projectxxx;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.projectxxx.QuestionPackages.QuestionMainFragment;
import com.example.projectxxx.RatingPackages.RatingMainFragment;

public class MainActivitySecond extends AppCompatActivity {
    private FragmentManager fragmentManager=getSupportFragmentManager();

    QuestionMainFragment questionMainFrag;  //фрагмент для основной ленты с вопросами
    RatingMainFragment ratingMainFrag;   //фрагмент для рейтинга
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);

        frameLayout=findViewById(R.id.Frame_container);

        questionMainFrag=new QuestionMainFragment(); //новый обьект
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.Frame_container,questionMainFrag);//Добавляем QuestionMainFragment к активности
        //fragmentTransaction.hide(QuestionMainFragment);//Прячем фрагмент (делает невидимым на экране)
        fragmentTransaction.commit();

        ratingMainFrag=new RatingMainFragment(); //новый обьект
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.Frame_container,ratingMainFrag);
        fragmentTransaction.hide(ratingMainFrag);
        fragmentTransaction.commit();

        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    FragmentTransaction fragmentTransaction1=fragmentManager.beginTransaction();
                    fragmentTransaction1.hide(ratingMainFrag);//скрываем
                    fragmentTransaction1.show(questionMainFrag);
                    fragmentTransaction1.commit();
                    break;
                case R.id.navigation_rating:
                    fragmentTransaction1=fragmentManager.beginTransaction();
                    fragmentTransaction1.hide(questionMainFrag);//скрываем
                    fragmentTransaction1.show(ratingMainFrag);
                    fragmentTransaction1.commit();
                    break;
            }
            return true;
        }
    };
}
