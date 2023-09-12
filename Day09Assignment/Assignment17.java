package neebalsgurukul.day09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment17 {

	public static void main(String[] args) {
        LocalDate cd = LocalDate.of(2023, 8, 28); 
        LocalDate ed = LocalDate.of(2023, 9, 3);  

        while (cd.isBefore(ed) || cd.isEqual(ed)) {
            LocalDate week = cd.with(DayOfWeek.MONDAY);
            LocalDate weekend = cd.with(DayOfWeek.SUNDAY);

            DateTimeFormatter f = DateTimeFormatter.ofPattern("E dd/MM/yyyy");
            String str1 = week.format(f);
            String str2 = weekend.format(f);

            System.out.println("First day: " + str1);
            System.out.println("Last day: " + str2);

            // Move to the next week
            cd = cd.plusDays(7);
        }
    }

}
