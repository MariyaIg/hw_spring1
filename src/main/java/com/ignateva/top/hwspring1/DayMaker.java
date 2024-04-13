package com.ignateva.top.hwspring1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Calendar;
@Component
public class DayMaker {

   private int dayOfWeek;
   private @Qualifier("english") Language eng;
   private @Qualifier("italian") Language ital;
   private @Qualifier("german") Language germ;


    public DayMaker() {
    }

    public DayMaker(Language eng, Language ital, Language germ) {
        this.eng = eng;
        this.ital = ital;
        this.germ = germ;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getTodaysDayOfWeek() {
        Calendar c = Calendar.getInstance();

        return dayOfWeek=c.get(Calendar.DAY_OF_WEEK)-1;
    }
    public void MakeDay(int n, int dayOfWeek){
        if (n == 1) {eng.getLanguage(dayOfWeek);}
        if (n == 2) {ital.getLanguage(dayOfWeek);}
        if (n == 3) {germ.getLanguage(dayOfWeek);}
    }

}
