package com.ignateva.top.hwspring1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Language eng = context.getBean("english", Language.class);
        Language ital = context.getBean("italian", Language.class);
        Language germ = context.getBean("german", Language.class);

       DayMaker dayMaker= new DayMaker(eng,ital,germ);
       int day = dayMaker.getTodaysDayOfWeek();
        Scanner scan = new Scanner(System.in);
        System.out.println("1 -английский 2- итальянcкий 3- немецкий");

        int n = scan.nextInt();
        dayMaker.MakeDay(n,day);

        context.close();
    }
}
