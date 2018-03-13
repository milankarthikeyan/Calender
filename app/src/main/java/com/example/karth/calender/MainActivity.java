package com.example.karth.calender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "mainactivity";
    private TextView thedate;
    private Button buttoncalender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thedate = (TextView)findViewById(R.id.date);
        buttoncalender = (Button) findViewById(R.id.calendar);
        Intent incoming = getIntent();
        String date = incoming.getStringExtra("date");
        thedate.setText(date);

        buttoncalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Calender_layout.class);
                startActivity(intent);

            }
        });


    }
}
