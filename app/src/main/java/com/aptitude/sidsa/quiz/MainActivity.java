package com.aptitude.sidsa.quiz;
import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.HashMap;
import java.util.Map;
import android.app.ProgressDialog;
public class MainActivity extends AppCompatActivity {
    Context context;

    private static EditText email,pass,username;
    String visit;
    private static Button b1;
    private FirebaseAuth mAuth;
    private String mail,password,k,sl,user1;
    private DatabaseReference mDatabase,mDatabase1;
    private ProgressDialog mprog;
    int attempts=3;
    int temp=0;
    private int exit=0;
    String preferences_name = "isFirstTime";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        click();
    }

    public  void  firstTime(){

        SharedPreferences sharedTime = getSharedPreferences(preferences_name,0);
        if (sharedTime.getBoolean("firstTime",true))
        {
            //Your tutorial code
            sharedTime.edit().putBoolean("firstTime",false).apply();
        }
        else
        {
            Intent intent=new Intent(MainActivity.this,LAST.class);
            startActivity(intent);
            finish();
        }

    }

    public void click()
    {

        b1= (Button) findViewById(R.id.button);
        email= (EditText) findViewById(R.id.editText2);
        pass= (EditText) findViewById(R.id.editText);
        username= (EditText) findViewById(R.id.editText3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   login_func();

            }
        });
    }

    public void login_func() {
        mprog=new ProgressDialog(this);
        mail = email.getText().toString().trim();
        password = pass.getText().toString().trim();
        user1=username.getText().toString().trim();
        if (!TextUtils.isEmpty(mail) && !TextUtils.isEmpty(password)) {
            mAuth.signInWithEmailAndPassword(mail, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override

                        public void onComplete(@NonNull Task<AuthResult> task) {
                            mprog.setMessage("Loading");
                            mprog.show();
                              if (task.isSuccessful()) {
                                 String ad_mail;
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                ad_mail = user.getEmail().toString();
                                /////
                                mDatabase = FirebaseDatabase.getInstance().getReference("Participants").child(user1).child("Visited");
                                  mDatabase.addValueEventListener(new ValueEventListener() {
                                      @Override
                                      public void onDataChange(DataSnapshot dataSnapshot) {
                                          k=dataSnapshot.getValue().toString();
                                          if(k.equals("0")) {
                                              mDatabase.setValue("1");
                                              mDatabase1= FirebaseDatabase.getInstance().getReference("Participants").child("Chinmay").child("Slot");
                                              mDatabase1.addValueEventListener(new ValueEventListener() {
                                                  @Override
                                                  public void onDataChange(DataSnapshot dataSnapshot) {
                                                      sl=dataSnapshot.getValue().toString();
                                                      if(sl.equals("1"))
                                                      {
                                                          Intent i = new Intent(MainActivity.this, Question.class);
                                                          i.putExtra("mystring1",user1);
                                                          i.putExtra("mystring", "slot1");
                                                          startActivity(i);
                                                      }
                                                      else
                                                      {
                                                          Intent i = new Intent(MainActivity.this, Question.class);
                                                          i.putExtra("mystring1",user1);
                                                          i.putExtra("mystring", "slot2");
                                                          startActivity(i);
                                                      }
                                                  }

                                                  @Override
                                                  public void onCancelled(DatabaseError databaseError) {

                                                  }
                                              });

                                              mprog.dismiss();
                                          }
                                          else
                                          {

                                          }
                                      }

                                      @Override
                                      public void onCancelled(DatabaseError databaseError) {

                                      }
                                  });

                            } else {
                                Toast.makeText(MainActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
        }
        else
        {
            Toast.makeText(MainActivity.this, "Enter mail id and password!", Toast.LENGTH_SHORT).show();

        }

    }



}
