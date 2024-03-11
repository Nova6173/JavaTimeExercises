package se.JavaLexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExercise {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today´s date: " + today);

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }

}
