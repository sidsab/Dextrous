package com.aptitude.sidsa.quiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



import com.google.firebase.auth.FirebaseAuth;

public class LAST extends AppCompatActivity implements inter1 {

    public TextView txt;
    private DatabaseReference mDatabase1,mDatabase;
    private String user2, sl=null;
    private Button b;
    int res1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        txt = (TextView) findViewById(R.id.textView11);
        user2 = getIntent().getStringExtra("mystring2");
        for (int i = 0; i < 39; i++) {
            res1 = res1 + a[i];
        }
        txt.setText("your score is " + res1);
        final String s11;
        b = (Button) findViewById(R.id.buttonsb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase = FirebaseDatabase.getInstance().getReference("Participants").child(user2).child("Score");
                mDatabase.setValue(res1);

                mDatabase1 = FirebaseDatabase.getInstance().getReference("Participants").child(user2).child("Score");
                mDatabase1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        sl = dataSnapshot.getValue().toString();
                            Toast.makeText(LAST.this,"SUBMITTED", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                        Toast.makeText(LAST.this,"TRY AGAIN! CHECK INTERNET", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }


    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("QUIT")
                .setMessage("Are you sure you want to Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        FirebaseAuth.getInstance().signOut();
                        startActivity(new Intent(LAST.this, MainActivity.class));

                    }

                })
                .setNegativeButton("No", null)
                .show();

    }
}

