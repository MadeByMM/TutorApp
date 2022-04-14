package com.example.tutorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Toolbox extends Fragment {

    public Toolbox() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_toolbox, null);

        Button toolbutton1 = root.findViewById(R.id.toolbutton1);
        toolbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.role).getVisibility() == View.GONE) {
                    root.findViewById(R.id.role).setVisibility(View.VISIBLE);
                    toolbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.role).setVisibility(View.GONE);
                    toolbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button rolebutton1 = root.findViewById(R.id.rolebutton1);
        rolebutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.roletextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.roletextview1).setVisibility(View.VISIBLE);
                    rolebutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.roletextview1).setVisibility(View.GONE);
                    rolebutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button rolebutton2 = root.findViewById(R.id.rolebutton2);
        rolebutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.roletextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.roletextview2).setVisibility(View.VISIBLE);
                    rolebutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.roletextview2).setVisibility(View.GONE);
                    rolebutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button toolbutton2 = root.findViewById(R.id.toolbutton2);
        toolbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.recruit).getVisibility() == View.GONE) {
                    root.findViewById(R.id.recruit).setVisibility(View.VISIBLE);
                    toolbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.recruit).setVisibility(View.GONE);
                    toolbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button recruitbutton1 = root.findViewById(R.id.recruitbutton1);
        recruitbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.recruittextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.recruittextview1).setVisibility(View.VISIBLE);
                    recruitbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.recruittextview1).setVisibility(View.GONE);
                    recruitbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button recruitbutton2 = root.findViewById(R.id.recruitbutton2);
        recruitbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.recruittextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.recruittextview2).setVisibility(View.VISIBLE);
                    recruitbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.recruittextview2).setVisibility(View.GONE);
                    recruitbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button recruitbutton3 = root.findViewById(R.id.recruitbutton3);
        recruitbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.recruittextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.recruittextview3).setVisibility(View.VISIBLE);
                    recruitbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.recruittextview3).setVisibility(View.GONE);
                    recruitbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button recruitbutton4 = root.findViewById(R.id.recruitbutton4);
        recruitbutton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.recruittextview4).getVisibility() == View.GONE) {
                    root.findViewById(R.id.recruittextview4).setVisibility(View.VISIBLE);
                    recruitbutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.recruittextview4).setVisibility(View.GONE);
                    recruitbutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button recruitbutton5 = root.findViewById(R.id.recruitbutton5);
        recruitbutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.recruittextview5).getVisibility() == View.GONE) {
                    root.findViewById(R.id.recruittextview5).setVisibility(View.VISIBLE);
                    recruitbutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.recruittextview5).setVisibility(View.GONE);
                    recruitbutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button toolbutton3 = root.findViewById(R.id.toolbutton3);
        toolbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.conflict).getVisibility() == View.GONE) {
                    root.findViewById(R.id.conflict).setVisibility(View.VISIBLE);
                    toolbutton3.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.conflict).setVisibility(View.GONE);
                    toolbutton3.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button conflictbutton1 = root.findViewById(R.id.conflictbutton1);
        conflictbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.conflicttextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.conflicttextview1).setVisibility(View.VISIBLE);
                    conflictbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.conflicttextview1).setVisibility(View.GONE);
                    conflictbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button conflictbutton2 = root.findViewById(R.id.conflictbutton2);
        conflictbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.conflicttextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.conflicttextview2).setVisibility(View.VISIBLE);
                    conflictbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.conflicttextview2).setVisibility(View.GONE);
                    conflictbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button conflictbutton3 = root.findViewById(R.id.conflictbutton3);
        conflictbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.conflicttextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.conflicttextview3).setVisibility(View.VISIBLE);
                    conflictbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.conflicttextview3).setVisibility(View.GONE);
                    conflictbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });


        Button toolbutton4 = root.findViewById(R.id.toolbutton4);
        toolbutton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.who).getVisibility() == View.GONE) {
                    root.findViewById(R.id.who).setVisibility(View.VISIBLE);
                    toolbutton4.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.who).setVisibility(View.GONE);
                    toolbutton4.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button whobutton1 = root.findViewById(R.id.whobutton1);
        whobutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview1).setVisibility(View.VISIBLE);
                    whobutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview1).setVisibility(View.GONE);
                    whobutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton2 = root.findViewById(R.id.whobutton2);
        whobutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview2).setVisibility(View.VISIBLE);
                    whobutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview2).setVisibility(View.GONE);
                    whobutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton3 = root.findViewById(R.id.whobutton3);
        whobutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview3).setVisibility(View.VISIBLE);
                    whobutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview3).setVisibility(View.GONE);
                    whobutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton4 = root.findViewById(R.id.whobutton4);
        whobutton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview4).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview4).setVisibility(View.VISIBLE);
                    whobutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview4).setVisibility(View.GONE);
                    whobutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton5 = root.findViewById(R.id.whobutton5);
        whobutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview5).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview5).setVisibility(View.VISIBLE);
                    whobutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview5).setVisibility(View.GONE);
                    whobutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton6 = root.findViewById(R.id.whobutton6);
        whobutton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview6).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview6).setVisibility(View.VISIBLE);
                    whobutton6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview6).setVisibility(View.GONE);
                    whobutton6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton7 = root.findViewById(R.id.whobutton7);
        whobutton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview7).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview7).setVisibility(View.VISIBLE);
                    whobutton7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview7).setVisibility(View.GONE);
                    whobutton7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button whobutton8 = root.findViewById(R.id.whobutton8);
        whobutton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.whotextview8).getVisibility() == View.GONE) {
                    root.findViewById(R.id.whotextview8).setVisibility(View.VISIBLE);
                    whobutton8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.whotextview8).setVisibility(View.GONE);
                    whobutton8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button toolbutton5 = root.findViewById(R.id.toolbutton5);
        toolbutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.bilag).getVisibility() == View.GONE) {
                    root.findViewById(R.id.bilag).setVisibility(View.VISIBLE);
                    toolbutton5.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.bilag).setVisibility(View.GONE);
                    toolbutton5.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button bilagbutton1 = root.findViewById(R.id.bilagbutton1);
        bilagbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.bilagtextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.bilagtextview1).setVisibility(View.VISIBLE);
                    bilagbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.bilagtextview1).setVisibility(View.GONE);
                    bilagbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        Button bilagbutton2 = root.findViewById(R.id.bilagbutton2);
        bilagbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.bilagtextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.bilagtextview2).setVisibility(View.VISIBLE);
                    bilagbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.bilagtextview2).setVisibility(View.GONE);
                    bilagbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }
            }
        });

        return root;
    }



}