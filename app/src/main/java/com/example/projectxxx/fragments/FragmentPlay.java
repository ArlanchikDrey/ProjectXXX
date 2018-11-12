package com.example.projectxxx.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectxxx.R;

public class FragmentPlay extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ConstraintLayout constraintLayout= (ConstraintLayout) inflater.inflate(R.layout.fragment_play, container, false);
        return constraintLayout;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottomNavigationView);
        //это все можно изменить
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.questions:
                        //список простых вопросов за которые практически нчего не дают
                        break;
                    case R.id.questionsWithPresent:
                        //список еженедельных вопросов за которые ты получаешь много золота
                        break;
                    case R.id.profile:
                        //твой профиль в котором вся информация о тебе
                        //если человек не зарегестрировался предложить ему это сделать
                        break;
                }
                return true;
            }
        });
    }

    public static Fragment newInstance(){
        FragmentPlay fragment = new FragmentPlay();
        return fragment;
    }
}
