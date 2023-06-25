package com.example.Tutorium.service;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

@Service
public class DateService {

    public LocalTime getTime() {
        return LocalTime.now();

    }
    public String getDate(String format){
        LocalDate localDate = LocalDate.now();
        if( format != null){
            //Datum in einem bestimten format zurückgeben
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
            return  dtf.format(localDate);
        }
        return localDate.toString();
    }
}
