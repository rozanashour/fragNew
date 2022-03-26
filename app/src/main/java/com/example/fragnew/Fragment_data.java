package com.example.fragnew;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_data extends Fragment {



    public Fragment_data() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data, container, false);
        TextView tv = view.findViewById(R.id.fragTV);

        Bundle bundle= getArguments();
        String t = bundle.getString("data");
        tv.setText(t);
        return  view;
    }
}