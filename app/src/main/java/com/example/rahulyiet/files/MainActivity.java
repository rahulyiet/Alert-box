package com.example.rahulyiet.files;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name,age,cls,email,country,state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        cls=findViewById(R.id.cls);
        email=findViewById(R.id.email);
        country=findViewById(R.id.country);
        state=findViewById(R.id.state);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(name.getText().toString())){
                    name.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(age.getText().toString())){
                    age.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(cls.getText().toString())){
                    cls.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(email.getText().toString())){
                    email.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(country.getText().toString())){
                    country.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(state.getText().toString())){
                    state.setError("Required Filed");
                    return;
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("submit confirmation");
                builder.setMessage("Are you sure want to continue");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }

                });

                builder.show();
            }
        });


    }
}
