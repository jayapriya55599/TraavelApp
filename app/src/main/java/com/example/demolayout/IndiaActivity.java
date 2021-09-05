package com.example.demolayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class IndiaActivity extends AppCompatActivity {

    ImageView backToHome;
    TextView displayDate;
    String date;
    SimpleDateFormat simpleDateFormat;


    RecyclerView secondScreenCard;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);


        displayDate=findViewById(R.id.dateInfo);
        //To get date  - day etc
        Calendar c= Calendar.getInstance();

        simpleDateFormat = new SimpleDateFormat("EEEE, d MMM yyyy");
        date=simpleDateFormat.format(c.getTime());
        displayDate.setText(date);


        backToHome=findViewById(R.id.backToHome);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(IndiaActivity.this, "Back Home", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


        secondScreenCard=findViewById(R.id.recyclerView);
        secondScreenRecyclerView();
    }

    private void secondScreenRecyclerView() {
        secondScreenCard.setHasFixedSize(true);
        secondScreenCard.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<SecondScreenCardModel>  secondScreenCardModelArrayL=new ArrayList<>();

        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.flight,R.drawable.airplane_route,"$555","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","5 h 30 m","13:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.car1,R.drawable.airplane_route,"$522","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","6 h 30 m","13:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.train,R.drawable.airplane_route,"$533","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","5 h 10 m","14:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.hotel,R.drawable.airplane_route,"$544","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","4 h 30 m","15:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.crusie11,R.drawable.airplane_route,"$555","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","5 h 30 m","16:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.flight,R.drawable.airplane_route,"$566","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","3 h 30 m","17:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.car1,R.drawable.airplane_route,"$577","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","5 h 50 m","18:00","18:30"));
        secondScreenCardModelArrayL.add(new SecondScreenCardModel(R.drawable.train,R.drawable.airplane_route,"$588","21 Oct","21 Oct","JKT","TKY","(Indonesia)","(Japan)","5 h 30 m","19:00","18:30"));

        adapter= new SecondScreenCardAdapter(secondScreenCardModelArrayL);
        secondScreenCard.setAdapter(adapter);
    }
}



