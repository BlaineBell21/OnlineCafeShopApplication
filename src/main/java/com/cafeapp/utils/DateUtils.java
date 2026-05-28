package com.cafeapp.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String currentDateAndTime(){ // used to get current, local time when making a new transaction
        LocalDateTime timeRightNow = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss"); // formatted as shown in capstone example
        String currentTime = timeRightNow.format(fmt);

        return currentTime; // returns current, local time
    }
    public static String currentDate(){ //used to get current, local date when making a new transaction
        LocalDateTime todaysDate = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyyMMdd"); // formatted as shown in capstone example
        String currentDate = todaysDate.format(dateFormat);

        return currentDate; //returns current, local date
    }

}
