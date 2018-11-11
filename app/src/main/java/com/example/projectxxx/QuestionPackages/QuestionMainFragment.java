package com.example.projectxxx.QuestionPackages;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectxxx.R;

import java.util.zip.Inflater;

public class QuestionMainFragment extends Fragment {

//hello i am here
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_question_main,container,false);
        return view;
    }
}
