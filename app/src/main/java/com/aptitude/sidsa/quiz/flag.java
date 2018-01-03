package com.aptitude.sidsa.quiz;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class flag extends Fragment implements inter1{


    public String question;
    private Button bs;
    public Button[] flg = new Button[37];
    public Button btn_question;
    int flag,i;
    String min = null;
    String sec = null;
    int m,s;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        min = getArguments().getString("min");
        sec = getArguments().getString("sec");

        m = Integer.parseInt(min);
        s = Integer.parseInt(sec)-5;
        View v =  inflater.inflate(R.layout.fragment_flag, container, false);

        flg[0] = (Button)v.findViewById(R.id.button7);
        flg[1] = (Button)v.findViewById(R.id.button10);
        flg[2] = (Button)v.findViewById(R.id.button11);
        flg[3] = (Button)v.findViewById(R.id.button12);
        flg[4] = (Button)v.findViewById(R.id.button13);
        flg[5] = (Button)v.findViewById(R.id.button39);
        flg[6] = (Button)v.findViewById(R.id.button40);
        flg[7] = (Button)v.findViewById(R.id.button41);
        flg[8] = (Button)v.findViewById(R.id.button42);
        flg[9] = (Button)v.findViewById(R.id.button43);
        flg[10] = (Button)v.findViewById(R.id.button44);
        flg[11] = (Button)v.findViewById(R.id.button45);
        flg[12] = (Button)v.findViewById(R.id.button46);
        flg[13] = (Button)v.findViewById(R.id.button47);
        flg[14] = (Button)v.findViewById(R.id.button48);
        flg[15] = (Button)v.findViewById(R.id.button49);
        flg[16] = (Button)v.findViewById(R.id.button50);
        flg[17] = (Button)v.findViewById(R.id.button51);
        flg[18] = (Button)v.findViewById(R.id.button52);
        flg[19] = (Button)v.findViewById(R.id.button53);
        flg[20] = (Button)v.findViewById(R.id.button54);
        flg[21] = (Button)v.findViewById(R.id.button55);
        flg[22] = (Button)v.findViewById(R.id.button56);
        flg[23] = (Button)v.findViewById(R.id.button57);
        flg[24] = (Button)v.findViewById(R.id.button58);
        flg[25] = (Button)v.findViewById(R.id.button59);
        flg[26] = (Button)v.findViewById(R.id.button60);
        flg[27] = (Button)v.findViewById(R.id.button61);
        flg[28] = (Button)v.findViewById(R.id.button62);
        flg[29] = (Button)v.findViewById(R.id.button63);
        flg[30] = (Button)v.findViewById(R.id.button64);
        flg[31] = (Button)v.findViewById(R.id.button65);
        flg[32] = (Button)v.findViewById(R.id.button66);
        flg[33] = (Button)v.findViewById(R.id.button67);
        flg[34] = (Button)v.findViewById(R.id.button68);
        flg[35] = (Button)v.findViewById(R.id.button3);
        flg[36] = (Button)v.findViewById(R.id.button14);

        for (i=0; i<36; i++)
        {
            if (flag_question[i]==1)
            {
                flg[i].setTextColor(Color.RED);
            }
        }

        bs=(Button)v.findViewById(R.id.button9);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                String user1 =getActivity().getIntent().getStringExtra("mystring1");
                Intent intent1=new Intent(getActivity(),LAST.class);
                intent1.putExtra("mystring2",user1);
                startActivity(intent1);
            }
        });



        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",1);
                bundle.putInt("min",m);
                bundle.putInt("sec",s);

                bundle.putInt("valueforcounter",1);
                //fragment.setArguments(bundle1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",2);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",3);
                bundle.putInt("min",m);
                bundle.putInt("sec",s);

                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",4);
                bundle.putInt("min",m);
                bundle.putInt("sec",s);

                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",5);
                bundle.putInt("min",m);
                bundle.putInt("sec",s);

                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",6);
                bundle.putInt("min",m);
                bundle.putInt("sec",s);

                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",7);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",8);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",9);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",10);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",11);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",12);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",13);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",14);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",15);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",16);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",17);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",18);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",19);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",20);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",21);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",22);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",23);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",24);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });
        flg[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",25);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",26);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",27);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",28);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",29);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",30);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[30].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",31);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[31].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",32);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[32].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",33);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[33].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",34);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[34].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",35);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[35].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",36);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[36].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("min",m);
                bundle.putInt("sec",s);
                bundle.putInt("value",37);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });
        return v;
    }
}
