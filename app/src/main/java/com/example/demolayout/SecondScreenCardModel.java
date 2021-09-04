package com.example.demolayout;

public class SecondScreenCardModel {

    int flightImage,flightRoute;
    String priceButton,dateInfo1,dateInfo2,placeSrc,placeDest,placeSrcName,placeSrcDest,totalHour,startTime,endTime;

    public SecondScreenCardModel(int flightImage, int flightRoute, String priceButton, String dateInfo1, String dateInfo2, String placeSrc, String placeDest, String placeSrcName, String placeSrcDest, String totalHour, String startTime, String endTime) {
        this.flightImage = flightImage;
        this.flightRoute = flightRoute;
        this.priceButton = priceButton;
        this.dateInfo1 = dateInfo1;
        this.dateInfo2 = dateInfo2;
        this.placeSrc = placeSrc;
        this.placeDest = placeDest;
        this.placeSrcName = placeSrcName;
        this.placeSrcDest = placeSrcDest;
        this.totalHour = totalHour;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getFlightImage() {
        return flightImage;
    }

    public int getFlightRoute() {
        return flightRoute;
    }

    public String getPriceButton() {
        return priceButton;
    }

    public String getDateInfo1() {
        return dateInfo1;
    }

    public String getDateInfo2() {
        return dateInfo2;
    }

    public String getPlaceSrc() {
        return placeSrc;
    }

    public String getPlaceDest() {
        return placeDest;
    }

    public String getPlaceSrcName() {
        return placeSrcName;
    }

    public String getPlaceSrcDest() {
        return placeSrcDest;
    }

    public String getTotalHour() {
        return totalHour;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
