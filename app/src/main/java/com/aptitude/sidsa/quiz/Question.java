package com.aptitude.sidsa.quiz;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Question extends AppCompatActivity {

private static Button n;
    static int cnt=0;
    int counter2 = 60, counter1=59;

    ProgressBar mprogressBar;
    public int counter;
    TextView tv;
    //final TextView lable = (TextView)findViewById(R.id.textView12);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        final HomeWatcher mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new inter() {
            @Override
            public void onHomePressed() {
                finish();
                Intent intent1=new Intent(Question.this,LAST.class);
                startActivity(intent1);
            }
            @Override
            public void onHomeLongPressed() {
            }
        });
        mHomeWatcher.startWatch();
       //switch1();
    }

    public void OnPause()
    {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("QUIT")
                .setMessage("Are you sure you want to quit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent1=new Intent(Question.this,LAST.class);
                        startActivity(intent1);
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
}
