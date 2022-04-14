package com.example.tutorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Bookshelf extends Fragment {


    public Bookshelf() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_bookshelf, null);

        Button bookbutton1 = root.findViewById(R.id.bookbutton1);
        bookbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.pro).getVisibility() == View.GONE) {
                    root.findViewById(R.id.pro).setVisibility(View.VISIBLE);
                    bookbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.pro).setVisibility(View.GONE);
                    bookbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button bookbutton2 = root.findViewById(R.id.bookbutton2);
        bookbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.eventmaker).getVisibility() == View.GONE) {
                    root.findViewById(R.id.eventmaker).setVisibility(View.VISIBLE);
                    bookbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.eventmaker).setVisibility(View.GONE);
                    bookbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button bookbutton3 = root.findViewById(R.id.bookbutton3);
        bookbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.booktextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.booktextview3).setVisibility(View.VISIBLE);
                    bookbutton3.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.booktextview3).setVisibility(View.GONE);
                    bookbutton3.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button bookbutton4 = root.findViewById(R.id.bookbutton4);
        bookbutton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.starter).getVisibility() == View.GONE) {
                    root.findViewById(R.id.starter).setVisibility(View.VISIBLE);
                    bookbutton4.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.starter).setVisibility(View.GONE);
                    bookbutton4.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        return root;
    }
}