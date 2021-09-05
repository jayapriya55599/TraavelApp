package com.example.demolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserActivity extends AppCompatActivity {

    ImageView back_to_2_activity;
    TextView date_of_birth;
    String date_dob;
    SimpleDateFormat simpleDateFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        back_to_2_activity=findViewById(R.id.backToSecondActivity);
        back_to_2_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(UserActivity.this, "Back To Second Activity", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


        //DOB Display
        date_of_birth=findViewById(R.id.infoDob);

        //Calender
        Calendar calendar=Calendar.getInstance();

        //Date Format
        simpleDateFormat = new SimpleDateFormat("MMM, d yyyy");
        date_dob=simpleDateFormat.format(calendar.getTime());
        date_of_birth.setText(date_dob);



    }


}