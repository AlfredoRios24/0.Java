package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

  public static void main(String[] args) {
    
    // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
    //   How old when he died?
    //   How many days did he live?  

    
    // Bennedict Cumberbatch, July 19, 1976
    //   Born in a leap year?
    //   How many days in the year he was born?
    //   How many decades old is he?
    //   What was the day of the week on his 21st birthday?
    
    
    // Train departs Boston at 1:45PM and arrives New York 7:25PM
    //   How many minutes long is the train ride?
    //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
    LocalTime depart = LocalTime.of(13, 45); 
    LocalTime arrive = LocalTime.of(19, 25); 
      System.out.println("Planned Travel time: " +depart.until(arrive, MINUTES) +"minutes.");
      System.out.println("Delayed arrival time: " +arrive.plusHours(1).plusMinutes(19));
      System.out.println("");
    
    // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
    //   When does it arrive in Miami?
    //   When does it arrive if the flight is delays 4 hours 27 minutes?
    
    
    // School semester starts the second Tuesday of September of this year.
    //   Hint: Look at the TemporalAdjusters class
    //   What is the date?
    //   School summer vacation starts June 25th
    //   Assuming:
    //     *  Two weeks off in December
    //     *  Two other vacation weeks
    //     *  School is taught Monday - Friday
    //   How many days of school are there?
    //   Hint: keep track of the short weeks also
    int excludeWeeks = 5;
    LocalDate schoolStarts = LocalDate.of(2014, SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(TUESDAY)).with(TemporalAdjusters.next(TUESDAY)); 
    LocalDate endOfFirstWeek = schoolStarts.with(TemporalAdjusters.next(FRIDAY));
    long firstWeekDays = schoolStarts.until(endOfFirstWeek, DAYS) +1; 
      System.out.println("School starts: "+schoolStarts);
      LocalDate schoolEnds = LocalDate.of(2015, JUNE, 25);
      System.out.println("School ends: "+schoolEnds);
      long lastWeeksDays =0; 
        if (schoolEnds.getDayOfWeek() != MONDAY){
                    LocalDate lastWeekStart = schoolEnds.with(TemporalAdjusters.previous(MONDAY));
                    lastWeeksDays = lastWeekStart.until(schoolEnds, DAYS) +1; 
                    excludeWeeks++; 
                    }            
     long days = ((schoolStarts.until(schoolEnds, WEEKS) - excludeWeeks) *5);                
    days = days +firstWeekDays + lastWeeksDays; 
      System.out.println("Number of school days: "+days);
      System.out.println("");
    
    // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
    //   What is the time of the week's meetings?
   
  }
  
}
