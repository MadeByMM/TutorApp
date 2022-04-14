package com.example.tutorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Events extends Fragment {

    public Events() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_events, null);

        Button eventsbutton1 = root.findViewById(R.id.eventsbutton1);
        eventsbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.faglige).getVisibility() == View.GONE) {
                    root.findViewById(R.id.faglige).setVisibility(View.VISIBLE);
                    eventsbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.faglige).setVisibility(View.GONE);
                    eventsbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button fagligebutton1 = root.findViewById(R.id.fagligebutton1);
        fagligebutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.fagligetextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.fagligetextview1).setVisibility(View.VISIBLE);
                    fagligebutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.fagligetextview1).setVisibility(View.GONE);
                    fagligebutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button fagligebutton2 = root.findViewById(R.id.fagligebutton2);
        fagligebutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.fagligetextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.fagligetextview2).setVisibility(View.VISIBLE);
                    fagligebutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.fagligetextview2).setVisibility(View.GONE);
                    fagligebutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button fagligebutton3 = root.findViewById(R.id.fagligebutton3);
        fagligebutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.fagligetextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.fagligetextview3).setVisibility(View.VISIBLE);
                    fagligebutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.fagligetextview3).setVisibility(View.GONE);
                    fagligebutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button fagligebutton4 = root.findViewById(R.id.fagligebutton4);
        fagligebutton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.fagligetextview4).getVisibility() == View.GONE) {
                    root.findViewById(R.id.fagligetextview4).setVisibility(View.VISIBLE);
                    fagligebutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.fagligetextview4).setVisibility(View.GONE);
                    fagligebutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button fagligebutton5 = root.findViewById(R.id.fagligebutton5);
        fagligebutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.fagligetextview5).getVisibility() == View.GONE) {
                    root.findViewById(R.id.fagligetextview5).setVisibility(View.VISIBLE);
                    fagligebutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.fagligetextview5).setVisibility(View.GONE);
                    fagligebutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });


        Button eventsbutton2 = root.findViewById(R.id.eventsbutton2);
        eventsbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.social).getVisibility() == View.GONE) {
                    root.findViewById(R.id.social).setVisibility(View.VISIBLE);
                    eventsbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.social).setVisibility(View.GONE);
                    eventsbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button socialbutton1 = root.findViewById(R.id.socialbutton1);
        socialbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.socialtextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.socialtextview1).setVisibility(View.VISIBLE);
                    socialbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.socialtextview1).setVisibility(View.GONE);
                    socialbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        return root;
    }
}