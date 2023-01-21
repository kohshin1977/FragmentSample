package com.kohshin.fragmentsample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragment01 extends Fragment {
    private int cnt = 0;

    static Fragment01 newInstance(String str){
// Fragemnt01 インスタンス生成
        Fragment01 fragment01 = new Fragment01();

// Bundle にパラメータを設定
        Bundle args = new Bundle();
        args.putString("Fragment", str);
        fragment01.setArguments(args);

        return fragment01;
    }

    // FragmentのViewを生成して返す
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment01, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();

        if(args != null ) {
            String str_tmp = args.getString("Fragment");
            String str = str_tmp;

            TextView textView = view.findViewById(R.id.textview_01);
            textView.setText(str);
        }




    }
}