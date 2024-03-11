package se.JavaLexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today´s date: " + today);

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);

        LocalDate date = LocalDate.now().with(DayOfWeek.MONDAY).minusWeeks(1);

         for (int i = 0; i < 7; i++){
             System.out.println(date);
             date = date.plusDays(1);
         }
    }

}
