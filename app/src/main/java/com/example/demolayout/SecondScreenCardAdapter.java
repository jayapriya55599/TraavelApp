package com.example.demolayout;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class SecondScreenCardAdapter extends RecyclerView.Adapter<SecondScreenCardAdapter.SecondScreenViewHolder> {



    ArrayList<SecondScreenCardModel> secondScreenCardModelsArray;

    public SecondScreenCardAdapter(ArrayList<SecondScreenCardModel> secondScreenCardModelsArray) {
        this.secondScreenCardModelsArray = secondScreenCardModelsArray;
    }

    @NonNull
    @Override
    public SecondScreenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_srn_card,parent,false);
        SecondScreenViewHolder secondScreenViewHolder=new SecondScreenViewHolder(view);

        return secondScreenViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SecondScreenViewHolder holder, int position) {

        SecondScreenCardModel secondScreenCardModel=secondScreenCardModelsArray.get(position);
        holder.priceButton.setText(secondScreenCardModel.getPriceButton());
        holder.flightImage.setImageResource(secondScreenCardModel.getFlightImage());
        holder.dateInfo1.setText(secondScreenCardModel.getDateInfo1()) ;
        holder.dateInfo2.setText(secondScreenCardModel.getDateInfo2());
        holder.placeSrc.setText(String.format(Locale.US,secondScreenCardModel.getPlaceSrc()));
        holder.placeDest.setText(secondScreenCardModel.getPlaceDest());
        holder.placeSrcName.setText(secondScreenCardModel.getPlaceSrcName());
        holder.placeDestName.setText(secondScreenCardModel.getPlaceSrcDest());
        holder.flightRoute.setImageResource(secondScreenCardModel.getFlightRoute());
        holder.totalTime.setText(secondScreenCardModel.getTotalHour());
        holder.startTime.setText(secondScreenCardModel.getStartTime());
        holder.endTime.setText(secondScreenCardModel.getEndTime());
    }

    @Override
    public int getItemCount() {
        return secondScreenCardModelsArray.size();
    }


    public static class SecondScreenViewHolder extends RecyclerView.ViewHolder{


        Button priceButton;
        ImageView flightImage,flightRoute;
        TextView dateInfo1,dateInfo2,placeSrc,placeDest,placeSrcName,placeDestName,totalTime,startTime,endTime;


        public SecondScreenViewHolder(@NonNull View itemView) {
            super(itemView);


            priceButton=itemView.findViewById(R.id.priceButton);
            flightImage=itemView.findViewById(R.id.flightImage);
            dateInfo1=itemView.findViewById(R.id.flightDate1);
            dateInfo2=itemView.findViewById(R.id.flightDate2);
            placeSrc=itemView.findViewById(R.id.textViewSrc);
            placeDest=itemView.findViewById(R.id.textViewDes);
            placeSrcName=itemView.findViewById(R.id.textViewSrcName);
            placeDestName=itemView.findViewById(R.id.textViewDestNName);
            flightRoute=itemView.findViewById(R.id.imageAirPlaneRoute);
            totalTime=itemView.findViewById(R.id.hrTextView);
            startTime=itemView.findViewById(R.id.srtTime);
            endTime=itemView.findViewById(R.id.ArrTime);

            priceButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), UserActivity.class));

                }
            });
        }
    }


}
