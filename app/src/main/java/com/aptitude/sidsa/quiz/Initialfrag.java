package com.aptitude.sidsa.quiz;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Initialfrag extends Fragment implements inter1{

    ProgressBar mProgressBar, mProgressBar1;
    private EditText edtTimerValue;
    private String slot;
    private TextView textViewShowTime;
    private CountDownTimer countDownTimer;
    int flag=0;
    private int ActTime = 3600;
    private long totalTimeCountInMilliseconds;
    int mi,se;

    int counter2 = 60, counter1=59;
  //  int[] flag_question = new int[5];
    TextView tv;
    Button btnTimmer;

    int counter = 60,temp,clock=0;
    private RadioGroup radio_g;
    private TextView Q,q;
    private static RadioButton r1,r2,r3,r4,rx;
    private Button b1,bn,bp,bf,bt;
    int qcount=1;
    public Initialfrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_initialfrag, container, false);
        try
        {
            mi = getArguments().getInt("min");
            se = getArguments().getInt("sec");
            ActTime = mi*60+se;
            flag=1;

        }
        catch (Exception e)
        {

        }
        radio_g = (RadioGroup)view.findViewById(R.id.radioGroup);
        b1= (Button)view.findViewById(R.id.button2);
        bn= (Button) view.findViewById(R.id.button4);
        bp= (Button) view.findViewById(R.id.button6);
        bt = (Button) view.findViewById(R.id.button15);
        textViewShowTime = (TextView) view.findViewById(R.id.textView_timerview_time);

        bf = (Button) view.findViewById(R.id.button8);
        r1= (RadioButton) radio_g.findViewById(R.id.radioButton7);
        r2= (RadioButton) radio_g.findViewById(R.id.radioButton8);
        r3= (RadioButton) radio_g.findViewById(R.id.radioButton9);
        r4= (RadioButton) radio_g.findViewById(R.id.radioButton10);
        Q=(TextView)view.findViewById(R.id.textView5);
        q=(TextView)view.findViewById(R.id.textView4);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressbar_timerview);
        mProgressBar1 = (ProgressBar) view.findViewById(R.id.progressbar1_timerview);

        getResources().getStringArray(R.array.tab_names);
        select(1);
        try
        {

            temp = getArguments().getInt("value",1);
            clock=getArguments().getInt("valueforcounter",1);
            qcount=temp;
            bf.setBackgroundResource(R.drawable.red_flag);
            select(qcount);
        }
        catch(Exception e)
        {

        }


            setclock();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selected_id=radio_g.getCheckedRadioButtonId();
                rx=(RadioButton)getView().findViewById(selected_id);
                if(rx==null)
                {
                    Toast.makeText(getActivity(),"SELECT A OPTION",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(), rx.getText().toString(), Toast.LENGTH_SHORT).show();
                    // r4.setChecked(false);
                    String str = getActivity().getIntent().getStringExtra("mystring");
                    if(str.equals("slot1"))
                    {

                    switch(qcount) {
                        case 1:
                            if (rx == r4) {
                                a[0] = 1;
                            } else {
                                a[0] = 0;
                            }
                            break;
                        case 2:
                            if (rx == r2) {
                                a[1] = 1;
                            } else {
                                a[1] = 0;
                            }
                            break;
                        case 3:
                            if (rx == r3) {
                                a[2] = 1;
                            } else {
                                a[2] = 0;
                            }
                            break;
                        case 4:
                            if (rx == r2) {
                                a[3] = 1;
                            } else {
                                a[3] = 0;
                            }
                            break;
                        case 5:
                            if (rx == r2) {
                                a[4] = 1;
                            } else {
                                a[4] = 0;
                            }
                            break;
                        case 6:
                            if (rx == r1) {
                                a[5] = 1;
                            } else {
                                a[5] = 0;
                            }
                            break;
                        case 7:
                            if (rx == r3) {
                                a[6] = 1;
                            } else {
                                a[6] = 0;
                            }
                            break;
                        case 8:
                            if (rx == r2) {
                                a[7] = 1;
                            } else {
                                a[7] = 0;
                            }
                            break;
                        case 9:
                            if (rx == r3) {
                                a[8] = 1;
                            } else {
                                a[8] = 0;
                            }
                            break;
                        case 10:
                            if (rx == r4) {
                                a[9] = 1;
                            } else {
                                a[9] = 0;
                            }
                            break;
                        case 11:
                            if (rx == r3) {
                                a[10] = 1;
                            } else {
                                a[10] = 0;
                            }
                            break;
                        case 12:
                            if (rx == r3) {
                                a[11] = 1;
                            } else {
                                a[11] = 0;
                            }
                            break;
                        case 13:
                            if (rx == r2) {
                                a[12] = 1;
                            } else {
                                a[12] = 0;
                            }
                            break;
                        case 14:
                            if (rx == r3) {
                                a[13] = 1;
                            } else {
                                a[13] = 0;
                            }
                            break;
                        case 15:
                            if (rx == r4) {
                                a[14] = 1;
                            } else {
                                a[14] = 0;
                            }
                            break;
                        case 16:
                            if (rx == r4) {
                                a[15] = 1;
                            } else {
                                a[15] = 0;
                            }
                            break;
                        case 17:
                            if (rx == r3) {
                                a[16] = 1;
                            } else {
                                a[16] = 0;
                            }
                            break;
                        case 18:
                            if (rx == r3) {
                                a[17] = 1;
                            } else {
                                a[17] = 0;
                            }
                            break;
                        case 19:
                            if (rx == r1) {
                                a[18] = 1;
                            } else {
                                a[18] = 0;
                            }
                            break;
                        case 20:
                            if (rx == r4) {
                                a[19] = 1;
                            } else {
                                a[19] = 0;
                            }
                            break;
                        case 21:
                            if (rx == r2) {
                                a[20] = 1;
                            } else {
                                a[20] = 0;
                            }
                            break;
                        case 22:
                            if (rx == r2) {
                                a[21] = 1;
                            } else {
                                a[21] = 0;
                            }
                            break;
                        case 23:
                            if (rx == r2) {
                                a[22] = 1;
                            } else {
                                a[22] = 0;
                            }
                            break;
                        case 24:
                            if (rx == r2) {
                                a[23] = 1;
                            } else {
                                a[23] = 0;
                            }
                            break;
                        case 25:
                            if (rx == r2) {
                                a[24] = 1;
                            } else {
                                a[24] = 0;
                            }
                            break;
                        case 26:
                            if (rx == r2) {
                                a[25] = 1;
                            } else {
                                a[25] = 0;
                            }
                            break;
                        case 27:
                            if (rx == r3) {
                                a[26] = 1;
                            } else {
                                a[26] = 0;
                            }
                            break;
                        case 28:
                            if (rx == r2) {
                                a[27] = 1;
                            } else {
                                a[27] = 0;
                            }
                            break;
                        case 29:
                            if (rx == r3) {
                                a[28] = 1;
                            } else {
                                a[28] = 0;
                            }
                            break;
                        case 30:
                            if (rx == r2) {
                                a[29] = 1;
                            } else {
                                a[29] = 0;
                            }
                            break;
                        case 31:
                            if (rx == r4) {
                                a[30] = 1;
                            } else {
                                a[30] = 0;
                            }
                            break;
                        case 32:
                            if (rx == r1) {
                                a[31] = 1;
                            } else {
                                a[31] = 0;
                            }
                            break;
                        case 33:
                            if (rx == r1) {
                                a[32] = 1;
                            } else {
                                a[32] = 0;
                            }
                            break;
                        case 34:
                            if (rx == r4) {
                                a[33] = 1;
                            } else {
                                a[33] = 0;
                            }
                            break;
                        case 35:
                            if (rx == r4) {
                                a[34] = 1;
                            } else {
                                a[34] = 0;
                            }
                            break;
                        case 36:
                            if (rx == r2) {
                                a[35] = 1;
                            } else {
                                a[35] = 0;
                            }
                            break;
                        case 37:
                            if (rx == r3) {
                                a[36] = 1;
                            } else {
                                a[36] = 0;
                            }
                            break;
                    }
                    }
                    else {
                        switch (qcount) {
                            case 1:
                                if (rx == r4) {
                                    a[0] = 1;
                                } else {
                                    a[0] = 0;
                                }
                                break;
                            case 2:
                                if (rx == r3) {
                                    a[1] = 1;
                                } else {
                                    a[1] = 0;
                                }
                                break;
                            case 3:
                                if (rx == r2) {
                                    a[2] = 1;
                                } else {
                                    a[2] = 0;
                                }
                                break;
                            case 4:
                                if (rx == r3) {
                                    a[3] = 1;
                                } else {
                                    a[3] = 0;
                                }
                                break;
                            case 5:
                                if (rx == r3) {
                                    a[4] = 1;
                                } else {
                                    a[4] = 0;
                                }
                                break;
                            case 6:
                                if (rx == r4) {
                                    a[5] = 1;
                                } else {
                                    a[5] = 0;
                                }
                                break;
                            case 7:
                                if (rx == r3) {
                                    a[6] = 1;
                                } else {
                                    a[6] = 0;
                                }
                                break;
                            case 8:
                                if (rx == r4) {
                                    a[7] = 1;
                                } else {
                                    a[7] = 0;
                                }
                                break;
                            case 9:
                                if (rx == r1) {
                                    a[8] = 1;
                                } else {
                                    a[8] = 0;
                                }
                                break;
                            case 10:
                                if (rx == r3) {
                                    a[9] = 1;
                                } else {
                                    a[9] = 0;
                                }
                                break;
                            case 11:
                                if (rx == r2) {
                                    a[10] = 1;
                                } else {
                                    a[10] = 0;
                                }
                                break;
                            case 12:
                                if (rx == r2) {
                                    a[11] = 1;
                                } else {
                                    a[11] = 0;
                                }
                                break;
                            case 13:
                                if (rx == r1) {
                                    a[12] = 1;
                                } else {
                                    a[12] = 0;
                                }
                                break;
                            case 14:
                                if (rx == r3) {
                                    a[13] = 1;
                                } else {
                                    a[13] = 0;
                                }
                                break;
                            case 15:
                                if (rx == r1) {
                                    a[14] = 1;
                                } else {
                                    a[14] = 0;
                                }
                                break;
                            case 16:
                                if (rx == r2) {
                                    a[15] = 1;
                                } else {
                                    a[15] = 0;
                                }
                                break;
                            case 17:
                                if (rx == r3) {
                                    a[16] = 1;
                                } else {
                                    a[16] = 0;
                                }
                                break;
                            case 18:
                                if (rx == r4) {
                                    a[17] = 1;
                                } else {
                                    a[17] = 0;
                                }
                                break;
                            case 19:
                                if (rx == r3) {
                                    a[18] = 1;
                                } else {
                                    a[18] = 0;
                                }
                                break;
                            case 20:
                                if (rx == r3) {
                                    a[19] = 1;
                                } else {
                                    a[19] = 0;
                                }
                                break;
                            case 21:
                                if (rx == r3) {
                                    a[20] = 1;
                                } else {
                                    a[20] = 0;
                                }
                                break;
                            case 22:
                                if (rx == r1) {
                                    a[21] = 1;
                                } else {
                                    a[21] = 0;
                                }
                                break;
                            case 23:
                                if (rx == r2) {
                                    a[22] = 1;
                                } else {
                                    a[22] = 0;
                                }
                                break;
                            case 24:
                                if (rx == r3) {
                                    a[23] = 1;
                                } else {
                                    a[23] = 0;
                                }
                                break;
                            case 25:
                                if (rx == r3) {
                                    a[24] = 1;
                                } else {
                                    a[24] = 0;
                                }
                                break;
                            case 26:
                                if (rx == r4) {
                                    a[25] = 1;
                                } else {
                                    a[25] = 0;
                                }
                                break;
                            case 27:
                                if (rx == r1) {
                                    a[26] = 1;
                                } else {
                                    a[26] = 0;
                                }
                                break;
                            case 28:
                                if (rx == r1) {
                                    a[27] = 1;
                                } else {
                                    a[27] = 0;
                                }
                                break;
                            case 29:
                                if (rx == r1) {
                                    a[28] = 1;
                                } else {
                                    a[28] = 0;
                                }
                                break;
                            case 30:
                                if (rx == r3) {
                                    a[29] = 1;
                                } else {
                                    a[29] = 0;
                                }
                                break;
                            case 31:
                                if (rx == r3) {
                                    a[30] = 1;
                                } else {
                                    a[30] = 0;
                                }
                                break;
                            case 32:
                                if (rx == r4) {
                                    a[31] = 1;
                                } else {
                                    a[31] = 0;
                                }
                                break;
                            case 33:
                                if (rx == r2) {
                                    a[32] = 1;
                                } else {
                                    a[32] = 0;
                                }
                                break;
                            case 34:
                                if (rx == r2) {
                                    a[33] = 1;
                                } else {
                                    a[33] = 0;
                                }
                                break;
                            case 35:
                                if (rx == r1) {
                                    a[34] = 1;
                                } else {
                                    a[34] = 0;
                                }
                                break;
                            case 36:
                                if (rx == r1) {
                                    a[35] = 1;
                                } else {
                                    a[35] = 0;
                                }
                                break;
                            case 37:
                                if (rx == r2) {
                                    a[36] = 1;
                                } else {
                                    a[36] = 0;
                                }
                                break;
                        }
                    }

                }
            }
        });
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = textViewShowTime.getText().toString();
                String[] word = time.split(":");

                String min = word[0];
                String sec = word[1];
                radio_g.clearCheck();
                if(qcount<38) {
                    qcount++;
                    if(qcount==38)
                    {
                        flag fragment = new flag();
                        Bundle bundle = new Bundle();

                        bundle.putString("min",min);
                        bundle.putString("sec",sec);
                        fragment.setArguments(bundle);
                        FragmentManager fragmentManager = getFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
                    }
                    else
                    {
                        if (flag_question[qcount-1]==1)
                        {
                            bf.setBackgroundResource(R.drawable.red_flag);
                        }

                        else if(flag_question[qcount-1]==0)
                        {
                            bf.setBackgroundResource(R.drawable.blue_flag);
                        }
                    }
                }


                select(qcount);
            }

        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = textViewShowTime.getText().toString();
                String[] word = time.split(":");

                String min = word[0];
                String sec = word[1];
                flag fragment = new flag();
                Bundle bundle = new Bundle();

                bundle.putString("min",min);
                bundle.putString("sec",sec);
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radio_g.clearCheck();

                if(qcount>1)
                {
                    qcount--;
                }
                select(qcount);

                if (flag_question[qcount-1]==1)
                {
                    bf.setBackgroundResource(R.drawable.red_flag);
                }

                else if(flag_question[qcount-1]==0)
                {
                    bf.setBackgroundResource(R.drawable.blue_flag);
                }
            }
        });
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bf.setBackgroundResource(R.drawable.blue_flag);
                if (flag_question[qcount-1]==0)
                {
                    bf.setBackgroundResource(R.drawable.red_flag);
                    flag_question[qcount-1]=1;
                }
                else if(flag_question[qcount-1] == 1)
                {
                    bf.setBackgroundResource(R.drawable.blue_flag);
                    flag_question[qcount-1]=0;
                }
            }
        });
        return view;
    }

public void setclock()
{
    mProgressBar.setVisibility(View.VISIBLE);
    mProgressBar1.setVisibility(View.VISIBLE);
    setTimer();
    mProgressBar.setVisibility(View.INVISIBLE);
    startTimer();
    mProgressBar1.setVisibility(View.VISIBLE);
}
    public void radio_qw()
    {
        int selected_id=radio_g.getCheckedRadioButtonId();
        rx=(RadioButton)getView().findViewById(selected_id);

    }

    public void select(int choice)
    {
        String str = getActivity().getIntent().getStringExtra("mystring");
        if(str.equals("slot1"))
        {
            select1(choice);
        }
        else
        {
            select2(choice);
        }
    }

    public void select2(int choice2)
    {
        String[] tab_names2 = getResources().getStringArray(R.array.tab_names2);

        switch (choice2)
        {
            case 1:
            {
                r1.setText(tab_names2[1]);
                r2.setText(tab_names2[2]);
                r3.setText(tab_names2[3]);
                r4.setText(tab_names2[4]);
                Q.setText("QUESTION 1");
                q.setText(tab_names2[0]);
                break;

            }
            case 2:
            {
                q.setText(tab_names2[5]);
                r1.setText(tab_names2[6]);
                r2.setText(tab_names2[7]);
                r3.setText(tab_names2[8]);
                r4.setText(tab_names2[9]);
                Q.setText("QUESTION 2");
                break;

            }
            case 3:
            {
                q.setText(tab_names2[10]);
                r1.setText(tab_names2[11]);
                r2.setText(tab_names2[12]);
                r3.setText(tab_names2[13]);
                r4.setText(tab_names2[14]);
                Q.setText("QUESTION 3");
                break;
            }
            case 4:
            {
                q.setText(tab_names2[15]);
                r1.setText(tab_names2[16]);
                r2.setText(tab_names2[17]);
                r3.setText(tab_names2[18]);
                r4.setText(tab_names2[19]);
                Q.setText("QUESTION 4");
                break;
            }
            case 5:
            {
                q.setText(tab_names2[20]);
                r1.setText(tab_names2[21]);
                r2.setText(tab_names2[22]);
                r3.setText(tab_names2[23]);
                r4.setText(tab_names2[24]);
                Q.setText("QUESTION 5");
                break;
            }
            case 6:
            {
                q.setText(tab_names2[25]);
                r1.setText(tab_names2[26]);
                r2.setText(tab_names2[27]);
                r3.setText(tab_names2[28]);
                r4.setText(tab_names2[29]);
                Q.setText("QUESTION 6");
                break;
            }
            case 7:
            {
                q.setText(tab_names2[30]);
                r1.setText(tab_names2[31]);
                r2.setText(tab_names2[32]);
                r3.setText(tab_names2[33]);
                r4.setText(tab_names2[34]);
                Q.setText("QUESTION 7");
                break;
            }
            case 8:
            {
                q.setText(tab_names2[35]);
                r1.setText(tab_names2[36]);
                r2.setText(tab_names2[37]);
                r3.setText(tab_names2[38]);
                r4.setText(tab_names2[39]);
                Q.setText("QUESTION 8");
                break;
            }
            case 9:
            {
                q.setText(tab_names2[40]);
                r1.setText(tab_names2[41]);
                r2.setText(tab_names2[42]);
                r3.setText(tab_names2[43]);
                r4.setText(tab_names2[44]);
                Q.setText("QUESTION 9");
                break;
            }
            case 10:
            {

                q.setText(tab_names2[45]);
                r1.setText(tab_names2[46]);
                r2.setText(tab_names2[47]);
                r3.setText(tab_names2[48]);
                r4.setText(tab_names2[49]);
                Q.setText("QUESTION 10");
                break;

            }
            case 11:
            {
                q.setText(tab_names2[50]);
                r1.setText(tab_names2[51]);
                r2.setText(tab_names2[52]);
                r3.setText(tab_names2[53]);
                r4.setText(tab_names2[54]);
                Q.setText("QUESTION 11");
                break;
            }
            case 12:
            {
                q.setText(tab_names2[55]);
                r1.setText(tab_names2[56]);
                r2.setText(tab_names2[57]);
                r3.setText(tab_names2[58]);
                r4.setText(tab_names2[59]);
                Q.setText("QUESTION 12");
                break;
            }
            case 13:
            {
                q.setText(tab_names2[60]);
                r1.setText(tab_names2[61]);
                r2.setText(tab_names2[62]);
                r3.setText(tab_names2[63]);
                r4.setText(tab_names2[64]);
                Q.setText("QUESTION 13");
                break;
            }
            case 14:
            {
                q.setText(tab_names2[65]);
                r1.setText(tab_names2[66]);
                r2.setText(tab_names2[67]);
                r3.setText(tab_names2[68]);
                r4.setText(tab_names2[69]);
                Q.setText("QUESTION 14");
                break;
            }
            case 15:
            {
                q.setText(tab_names2[70]);
                r1.setText(tab_names2[71]);
                r2.setText(tab_names2[72]);
                r3.setText(tab_names2[73]);
                r4.setText(tab_names2[74]);
                Q.setText("QUESTION 15");
                break;
            }
            case 16:
            {
                q.setText(tab_names2[75]);
                r1.setText(tab_names2[76]);
                r2.setText(tab_names2[77]);
                r3.setText(tab_names2[78]);
                r4.setText(tab_names2[79]);
                Q.setText("QUESTION 16");
                break;
            }
            case 17:
            {
                q.setText(tab_names2[80]);
                r1.setText(tab_names2[81]);
                r2.setText(tab_names2[82]);
                r3.setText(tab_names2[83]);
                r4.setText(tab_names2[84]);
                Q.setText("QUESTION 17");
                break;
            }
            case 18:
            {
                q.setText(tab_names2[85]);
                r1.setText(tab_names2[86]);
                r2.setText(tab_names2[87]);
                r3.setText(tab_names2[88]);
                r4.setText(tab_names2[89]);
                Q.setText("QUESTION 18");
                break;
            }
            case 19:
            {
                q.setText(tab_names2[90]);
                r1.setText(tab_names2[91]);
                r2.setText(tab_names2[92]);
                r3.setText(tab_names2[93]);
                r4.setText(tab_names2[94]);
                Q.setText("QUESTION 19");
                break;
            }
            case 20:
            {
                q.setText(tab_names2[95]);
                r1.setText(tab_names2[96]);
                r2.setText(tab_names2[97]);
                r3.setText(tab_names2[98]);
                r4.setText(tab_names2[99]);
                Q.setText("QUESTION 20");
                break;
            }
            case 21:
            {
                q.setText(tab_names2[100]);
                r1.setText(tab_names2[101]);
                r2.setText(tab_names2[102]);
                r3.setText(tab_names2[103]);
                r4.setText(tab_names2[104]);
                Q.setText("QUESTION 21");
                break;
            }
            case 22:
            {
                q.setText(tab_names2[105]);
                r1.setText(tab_names2[106]);
                r2.setText(tab_names2[107]);
                r3.setText(tab_names2[108]);
                r4.setText(tab_names2[109]);
                Q.setText("QUESTION 22");
                break;
            }
            case 23:
            {
                q.setText(tab_names2[110]);
                r1.setText(tab_names2[111]);
                r2.setText(tab_names2[112]);
                r3.setText(tab_names2[113]);
                r4.setText(tab_names2[114]);
                Q.setText("QUESTION 23");
                break;
            }
            case 24:
            {
                q.setText(tab_names2[115]);
                r1.setText(tab_names2[116]);
                r2.setText(tab_names2[117]);
                r3.setText(tab_names2[118]);
                r4.setText(tab_names2[119]);
                Q.setText("QUESTION 24");
                break;
            }
            case 25:
            {
                q.setText(tab_names2[120]);
                r1.setText(tab_names2[121]);
                r2.setText(tab_names2[122]);
                r3.setText(tab_names2[123]);
                r4.setText(tab_names2[124]);
                Q.setText("QUESTION 25");
                break;
            }
            case 26:
            {
                q.setText(tab_names2[125]);
                r1.setText(tab_names2[126]);
                r2.setText(tab_names2[127]);
                r3.setText(tab_names2[128]);
                r4.setText(tab_names2[129]);
                Q.setText("QUESTION 26");
                break;
            }
            case 27:
            {
                q.setText(tab_names2[130]);
                r1.setText(tab_names2[131]);
                r2.setText(tab_names2[132]);
                r3.setText(tab_names2[133]);
                r4.setText(tab_names2[134]);
                Q.setText("QUESTION 27");
                break;
            }
            case 28:
            {
                q.setText(tab_names2[135]);
                r1.setText(tab_names2[136]);
                r2.setText(tab_names2[137]);
                r3.setText(tab_names2[138]);
                r4.setText(tab_names2[139]);
                Q.setText("QUESTION 28");
                break;
            }
            case 29:
            {
                q.setText(tab_names2[140]);
                r1.setText(tab_names2[141]);
                r2.setText(tab_names2[142]);
                r3.setText(tab_names2[143]);
                r4.setText(tab_names2[144]);
                Q.setText("QUESTION 29");
                break;
            }
            case 30:
            {
                q.setText(tab_names2[145]);
                r1.setText(tab_names2[146]);
                r2.setText(tab_names2[147]);
                r3.setText(tab_names2[148]);
                r4.setText(tab_names2[149]);
                Q.setText("QUESTION 30");
                break;
            }
            case 31:
            {
                q.setText(tab_names2[150]);
                r1.setText(tab_names2[151]);
                r2.setText(tab_names2[152]);
                r3.setText(tab_names2[153]);
                r4.setText(tab_names2[154]);
                Q.setText("QUESTION 31");
                break;
            }
            case 32:
            {
                q.setText(tab_names2[155]);
                r1.setText(tab_names2[156]);
                r2.setText(tab_names2[157]);
                r3.setText(tab_names2[158]);
                r4.setText(tab_names2[159]);
                Q.setText("QUESTION 32");
                break;
            }
            case 33:
            {
                q.setText(tab_names2[160]);
                r1.setText(tab_names2[161]);
                r2.setText(tab_names2[162]);
                r3.setText(tab_names2[163]);
                r4.setText(tab_names2[164]);
                Q.setText("QUESTION 33");
                break;
            }
            case 34:
            {
                q.setText(tab_names2[165]);
                r1.setText(tab_names2[166]);
                r2.setText(tab_names2[167]);
                r3.setText(tab_names2[168]);
                r4.setText(tab_names2[169]);
                Q.setText("QUESTION 34");
                break;
            }
            case 35:
            {
                q.setText(tab_names2[170]);
                r1.setText(tab_names2[171]);
                r2.setText(tab_names2[172]);
                r3.setText(tab_names2[173]);
                r4.setText(tab_names2[174]);
                Q.setText("QUESTION 35");
                break;
            }
            case 36:
            {
                q.setText(tab_names2[175]);
                r1.setText(tab_names2[176]);
                r2.setText(tab_names2[177]);
                r3.setText(tab_names2[178]);
                r4.setText(tab_names2[179]);
                Q.setText("QUESTION 36");
                break;
            }
            case 37:
            {
                q.setText(tab_names2[180]);
                r1.setText(tab_names2[181]);
                r2.setText(tab_names2[182]);
                r3.setText(tab_names2[183]);
                r4.setText(tab_names2[184]);
                Q.setText("QUESTION 37");
                break;
            }
        }
    }


    public void select1(int choice)
    {

        String[] tab_names = getResources().getStringArray(R.array.tab_names);
        switch (choice)
        {
            case 1:
            {
                r1.setText("A. Anguish");
                r2.setText("B. Abstinence");
                r3.setText("C. Asperity");
                r4.setText("D. Leaning ");
                Q.setText("QUESTION 1");
                q.setText("Out of the given alternatives select the alternative which best expresses the meaning of the word - Proclivity");
                break;

            }
            case 2:
            {
                q.setText(tab_names[5]);
                r1.setText(tab_names[6]);
                r2.setText(tab_names[7]);
                r3.setText(tab_names[8]);
                r4.setText(tab_names[9]);
                Q.setText("QUESTION 2");
                break;

            }
            case 3:
            {
                q.setText(tab_names[10]);
                r1.setText(tab_names[11]);
                r2.setText(tab_names[12]);
                r3.setText(tab_names[13]);
                r4.setText(tab_names[14]);
                Q.setText("QUESTION 3");
                break;
            }
            case 4:
            {
                q.setText(tab_names[15]);
                r1.setText(tab_names[16]);
                r2.setText(tab_names[17]);
                r3.setText(tab_names[18]);
                r4.setText(tab_names[19]);
                Q.setText("QUESTION 4");
                break;
            }
            case 5:
            {
                q.setText(tab_names[20]);
                r1.setText(tab_names[21]);
                r2.setText(tab_names[22]);
                r3.setText(tab_names[23]);
                r4.setText(tab_names[24]);
                Q.setText("QUESTION 5");
                break;
            }
            case 6:
            {
                q.setText(tab_names[25]);
                r1.setText(tab_names[26]);
                r2.setText(tab_names[27]);
                r3.setText(tab_names[28]);
                r4.setText(tab_names[29]);
                Q.setText("QUESTION 6");
                break;
            }
            case 7:
            {
                q.setText(tab_names[30]);
                r1.setText(tab_names[31]);
                r2.setText(tab_names[32]);
                r3.setText(tab_names[33]);
                r4.setText(tab_names[34]);
                Q.setText("QUESTION 7");
                break;
            }
            case 8:
            {
                q.setText(tab_names[35]);
                r1.setText(tab_names[36]);
                r2.setText(tab_names[37]);
                r3.setText(tab_names[38]);
                r4.setText(tab_names[39]);
                Q.setText("QUESTION 8");
                break;
            }
            case 9:
            {
                q.setText(tab_names[40]);
                r1.setText(tab_names[41]);
                r2.setText(tab_names[42]);
                r3.setText(tab_names[43]);
                r4.setText(tab_names[44]);
                Q.setText("QUESTION 9");
                break;
            }
            case 10:
            {

                q.setText(tab_names[45]);
                r1.setText(tab_names[46]);
                r2.setText(tab_names[47]);
                r3.setText(tab_names[48]);
                r4.setText(tab_names[49]);
                Q.setText("QUESTION 10");
                break;

            }
            case 11:
            {
                q.setText(tab_names[50]);
                r1.setText(tab_names[51]);
                r2.setText(tab_names[52]);
                r3.setText(tab_names[53]);
                r4.setText(tab_names[54]);
                Q.setText("QUESTION 11");
                break;
            }
            case 12:
            {
                q.setText(tab_names[55]);
                r1.setText(tab_names[56]);
                r2.setText(tab_names[57]);
                r3.setText(tab_names[58]);
                r4.setText(tab_names[59]);
                Q.setText("QUESTION 12");
                break;
            }
            case 13:
            {
                q.setText(tab_names[60]);
                r1.setText(tab_names[61]);
                r2.setText(tab_names[62]);
                r3.setText(tab_names[63]);
                r4.setText(tab_names[64]);
                Q.setText("QUESTION 13");
                break;
            }
            case 14:
            {
                q.setText(tab_names[65]);
                r1.setText(tab_names[66]);
                r2.setText(tab_names[67]);
                r3.setText(tab_names[68]);
                r4.setText(tab_names[69]);
                Q.setText("QUESTION 14");
                break;
            }
            case 15:
            {
                q.setText(tab_names[70]);
                r1.setText(tab_names[71]);
                r2.setText(tab_names[72]);
                r3.setText(tab_names[73]);
                r4.setText(tab_names[74]);
                Q.setText("QUESTION 15");
                break;
            }
            case 16:
            {
                q.setText(tab_names[75]);
                r1.setText(tab_names[76]);
                r2.setText(tab_names[77]);
                r3.setText(tab_names[78]);
                r4.setText(tab_names[79]);
                Q.setText("QUESTION 16");
                break;
            }
            case 17:
            {
                q.setText(tab_names[80]);
                r1.setText(tab_names[81]);
                r2.setText(tab_names[82]);
                r3.setText(tab_names[83]);
                r4.setText(tab_names[84]);
                Q.setText("QUESTION 17");
                break;
            }
            case 18:
            {
                q.setText(tab_names[85]);
                r1.setText(tab_names[86]);
                r2.setText(tab_names[87]);
                r3.setText(tab_names[88]);
                r4.setText(tab_names[89]);
                Q.setText("QUESTION 18");
                break;
            }
            case 19:
            {
                q.setText(tab_names[90]);
                r1.setText(tab_names[91]);
                r2.setText(tab_names[92]);
                r3.setText(tab_names[93]);
                r4.setText(tab_names[94]);
                Q.setText("QUESTION 19");
                break;
            }
            case 20:
            {
                q.setText(tab_names[95]);
                r1.setText(tab_names[96]);
                r2.setText(tab_names[97]);
                r3.setText(tab_names[98]);
                r4.setText(tab_names[99]);
                Q.setText("QUESTION 20");
                break;
            }
            case 21:
            {
                q.setText(tab_names[100]);
                r1.setText(tab_names[101]);
                r2.setText(tab_names[102]);
                r3.setText(tab_names[103]);
                r4.setText(tab_names[104]);
                Q.setText("QUESTION 21");
                break;
            }
            case 22:
            {
                q.setText(tab_names[105]);
                r1.setText(tab_names[106]);
                r2.setText(tab_names[107]);
                r3.setText(tab_names[108]);
                r4.setText(tab_names[109]);
                Q.setText("QUESTION 22");
                break;
            }
            case 23:
            {
                q.setText(tab_names[110]);
                r1.setText(tab_names[111]);
                r2.setText(tab_names[112]);
                r3.setText(tab_names[113]);
                r4.setText(tab_names[114]);
                Q.setText("QUESTION 23");
                break;
            }
            case 24:
            {
                q.setText(tab_names[115]);
                r1.setText(tab_names[116]);
                r2.setText(tab_names[117]);
                r3.setText(tab_names[118]);
                r4.setText(tab_names[119]);
                Q.setText("QUESTION 24");
                break;
            }
            case 25:
            {
                q.setText(tab_names[120]);
                r1.setText(tab_names[121]);
                r2.setText(tab_names[122]);
                r3.setText(tab_names[123]);
                r4.setText(tab_names[124]);
                Q.setText("QUESTION 25");
                break;
            }
            case 26:
            {
                q.setText(tab_names[125]);
                r1.setText(tab_names[126]);
                r2.setText(tab_names[127]);
                r3.setText(tab_names[128]);
                r4.setText(tab_names[129]);
                Q.setText("QUESTION 26");
                break;
            }
            case 27:
            {
                q.setText(tab_names[130]);
                r1.setText(tab_names[131]);
                r2.setText(tab_names[132]);
                r3.setText(tab_names[133]);
                r4.setText(tab_names[134]);
                Q.setText("QUESTION 27");
                break;
            }
            case 28:
            {
                q.setText(tab_names[135]);
                r1.setText(tab_names[136]);
                r2.setText(tab_names[137]);
                r3.setText(tab_names[138]);
                r4.setText(tab_names[139]);
                Q.setText("QUESTION 28");
                break;
            }
            case 29:
            {
                q.setText(tab_names[140]);
                r1.setText(tab_names[141]);
                r2.setText(tab_names[142]);
                r3.setText(tab_names[143]);
                r4.setText(tab_names[144]);
                Q.setText("QUESTION 29");
                break;
            }
            case 30:
            {
                q.setText(tab_names[145]);
                r1.setText(tab_names[146]);
                r2.setText(tab_names[147]);
                r3.setText(tab_names[148]);
                r4.setText(tab_names[149]);
                Q.setText("QUESTION 30");
                break;
            }
            case 31:
            {
                q.setText(tab_names[150]);
                r1.setText(tab_names[151]);
                r2.setText(tab_names[152]);
                r3.setText(tab_names[153]);
                r4.setText(tab_names[154]);
                Q.setText("QUESTION 31");
                break;
            }
            case 32:
            {
                q.setText(tab_names[155]);
                r1.setText(tab_names[156]);
                r2.setText(tab_names[157]);
                r3.setText(tab_names[158]);
                r4.setText(tab_names[159]);
                Q.setText("QUESTION 32");
                break;
            }
            case 33:
            {
                q.setText(tab_names[160]);
                r1.setText(tab_names[161]);
                r2.setText(tab_names[162]);
                r3.setText(tab_names[163]);
                r4.setText(tab_names[164]);
                Q.setText("QUESTION 33");
                break;
            }
            case 34:
            {
                q.setText(tab_names[165]);
                r1.setText(tab_names[166]);
                r2.setText(tab_names[167]);
                r3.setText(tab_names[168]);
                r4.setText(tab_names[169]);
                Q.setText("QUESTION 34");
                break;
            }
            case 35:
            {
                q.setText(tab_names[170]);
                r1.setText(tab_names[171]);
                r2.setText(tab_names[172]);
                r3.setText(tab_names[173]);
                r4.setText(tab_names[174]);
                Q.setText("QUESTION 35");
                break;
            }
            case 36:
            {
                q.setText(tab_names[175]);
                r1.setText(tab_names[176]);
                r2.setText(tab_names[177]);
                r3.setText(tab_names[178]);
                r4.setText(tab_names[179]);
                Q.setText("QUESTION 36");
                break;
            }
            case 37:
            {
                q.setText(tab_names[180]);
                r1.setText(tab_names[181]);
                r2.setText(tab_names[182]);
                r3.setText(tab_names[183]);
                r4.setText(tab_names[184]);
                Q.setText("QUESTION 37");
                break;
            }




        }
    }

    private void setTimer(){
        int time = ActTime;

        totalTimeCountInMilliseconds =  time * 1000;
        if(flag==0)
        mProgressBar.setMax( time * 1000);
        if(flag==1)
        {
            mProgressBar.setMax( time * 1000);
        }
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(totalTimeCountInMilliseconds, 1) {
            @Override
            public void onTick(long leftTimeInMilliseconds) {
                long seconds = leftTimeInMilliseconds / 1000;
                if(flag==0)
                mProgressBar1.setProgress((int) (leftTimeInMilliseconds));
                if(flag==1)
                {
                    mProgressBar1.setProgress((int) (leftTimeInMilliseconds));

                }

                textViewShowTime.setText(String.format("%02d", seconds / 60)
                        + ":" + String.format("%02d", seconds % 60));
            }

            @Override
            public void onFinish() {
                textViewShowTime.setText("00:00");
                textViewShowTime.setVisibility(View.VISIBLE);
                mProgressBar.setVisibility(View.VISIBLE);
                mProgressBar1.setVisibility(View.GONE);
                getActivity().finish();
                Intent intent1=new Intent(getActivity(),LAST.class);
                startActivity(intent1);

            }
        }.start();
    }
}


