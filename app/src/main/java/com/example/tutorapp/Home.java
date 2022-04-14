package com.example.tutorapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_home, null);

        Button homebutton1 = root.findViewById(R.id.homebutton1);
        homebutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.join).getVisibility() == View.GONE) {
                    root.findViewById(R.id.join).setVisibility(View.VISIBLE);
                    homebutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.join).setVisibility(View.GONE);
                    homebutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button homebutton2 = root.findViewById(R.id.homebutton2);
        homebutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.news).getVisibility() == View.GONE) {
                    root.findViewById(R.id.news).setVisibility(View.VISIBLE);
                    homebutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.news).setVisibility(View.GONE);
                    homebutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button newsbutton1 = root.findViewById(R.id.newsbutton1);
        newsbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.newstextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.newstextview1).setVisibility(View.VISIBLE);
                    newsbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.newstextview1).setVisibility(View.GONE);
                    newsbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        return root;
    }


}