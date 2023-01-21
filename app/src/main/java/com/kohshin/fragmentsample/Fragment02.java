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

public class Fragment02 extends Fragment {
    private int cnt = 0;

    static Fragment02 newInstance(String str){
        // Fragemnt02 インスタンス生成
        Fragment02 fragment02 = new Fragment02();

        // Bundleにパラメータを設定
        Bundle barg = new Bundle();
        barg.putString("Fragment", str);
        fragment02.setArguments(barg);

        return fragment02;
    }

    // FragmentのViewを生成して返す
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment02, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();

        if(args != null ){
            String str_tmp = args.getString("Fragment");
            String str = str_tmp;

            TextView textView = view.findViewById(R.id.textview_02);
            textView.setText(str);
        }



    }
}
