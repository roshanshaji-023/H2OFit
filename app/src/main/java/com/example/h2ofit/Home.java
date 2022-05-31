package com.example.h2ofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    private ImageButton profile_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*for opening profile activity*/
        profile_button=(ImageButton) findViewById(R.id.imageButton8);
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerzonalize();

            }
        });

    }
    public void openPerzonalize(){
        Intent intent=new Intent(this, profile.class);
        startActivity(intent);
    }

}