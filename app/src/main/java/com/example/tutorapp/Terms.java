package com.example.tutorapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.fragment.app.Fragment;

public class Terms extends Fragment{

    public Terms() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_terms, null);


        Button termsbutton1 = root.findViewById(R.id.termsbutton1);
        termsbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.termstextView1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.termstextView1).setVisibility(View.VISIBLE);
                    termsbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.termstextView1).setVisibility(View.GONE);
                    termsbutton1.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }
            }
        });

        Button termsbutton2 = root.findViewById(R.id.termsbutton2);
        termsbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.ethics).getVisibility() == View.GONE) {
                    root.findViewById(R.id.ethics).setVisibility(View.VISIBLE);
                    termsbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.ethics).setVisibility(View.GONE);
                    termsbutton2.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }

            }
        });


        Button ethicsbutton1 = root.findViewById(R.id.ethicsbutton1);
        ethicsbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.ethicstextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.ethicstextview1).setVisibility(View.VISIBLE);
                    ethicsbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.ethicstextview1).setVisibility(View.GONE);
                    ethicsbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button ethicsbutton2 = root.findViewById(R.id.ethicsbutton2);
        ethicsbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.ethicstextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.ethicstextview2).setVisibility(View.VISIBLE);
                    ethicsbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.ethicstextview2).setVisibility(View.GONE);
                    ethicsbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button ethicsbutton3 = root.findViewById(R.id.ethicsbutton3);
        ethicsbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.ethicstextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.ethicstextview3).setVisibility(View.VISIBLE);
                    ethicsbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.ethicstextview3).setVisibility(View.GONE);
                    ethicsbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button termsbutton3 = root.findViewById(R.id.termsbutton3);
        termsbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coc).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coc).setVisibility(View.VISIBLE);
                    termsbutton3.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showless);
                } else {
                    root.findViewById(R.id.coc).setVisibility(View.GONE);
                    termsbutton3.setCompoundDrawablesWithIntrinsicBounds(0, 0,0,R.drawable.ic_showmore);
                }

            }
        });

        Button cocbutton1 = root.findViewById(R.id.cocbutton1);
        cocbutton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview1).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview1).setVisibility(View.VISIBLE);
                    cocbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview1).setVisibility(View.GONE);
                    cocbutton1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });


        Button cocbutton2 = root.findViewById(R.id.cocbutton2);
        cocbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview2).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview2).setVisibility(View.VISIBLE);
                    cocbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview2).setVisibility(View.GONE);
                    cocbutton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button cocbutton3 = root.findViewById(R.id.cocbutton3);
        cocbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview3).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview3).setVisibility(View.VISIBLE);
                    cocbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview3).setVisibility(View.GONE);
                    cocbutton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button cocbutton4 = root.findViewById(R.id.cocbutton4);
        cocbutton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview4).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview4).setVisibility(View.VISIBLE);
                    cocbutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview4).setVisibility(View.GONE);
                    cocbutton4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button cocbutton5 = root.findViewById(R.id.cocbutton5);
        cocbutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview5).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview5).setVisibility(View.VISIBLE);
                    cocbutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview5).setVisibility(View.GONE);
                    cocbutton5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button cocbutton6 = root.findViewById(R.id.cocbutton6);
        cocbutton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview6).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview6).setVisibility(View.VISIBLE);
                    cocbutton6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview6).setVisibility(View.GONE);
                    cocbutton6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button cocbutton7 = root.findViewById(R.id.cocbutton7);
        cocbutton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview7).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview7).setVisibility(View.VISIBLE);
                    cocbutton7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview7).setVisibility(View.GONE);
                    cocbutton7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });

        Button cocbutton8 = root.findViewById(R.id.cocbutton8);
        cocbutton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (root.findViewById(R.id.coctextview8).getVisibility() == View.GONE) {
                    root.findViewById(R.id.coctextview8).setVisibility(View.VISIBLE);
                    cocbutton8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_shrink, 0, 0, 0);
                } else {
                    root.findViewById(R.id.coctextview8).setVisibility(View.GONE);
                    cocbutton8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_expand, 0, 0, 0);
                }

            }
        });





        return root;
    }


}

