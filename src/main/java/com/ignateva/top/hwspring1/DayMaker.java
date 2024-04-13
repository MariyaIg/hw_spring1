package com.ignateva.top.hwspring1;

import java.util.Calendar;

public class DayMaker {

    int dayOfWeek;
    Language language;
    public DayMaker() {
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


}
