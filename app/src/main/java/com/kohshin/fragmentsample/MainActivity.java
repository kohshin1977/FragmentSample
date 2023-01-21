package com.kohshin.fragmentsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            // BackStackを設定
            fragmentTransaction.addToBackStack(null);

            // counterをパラメータとして設定
            int count = 0;
            fragmentTransaction.replace(R.id.container, Fragment01.newInstance(count));

            fragmentTransaction.commit();
        }
    }
}