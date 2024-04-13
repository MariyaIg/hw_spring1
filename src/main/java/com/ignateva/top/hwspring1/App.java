package com.ignateva.top.hwspring1;


import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DayMaker dayMaker = context.getBean("dayMaker", DayMaker.class);
        int dayOfWeek = dayMaker.getTodaysDayOfWeek();


        Scanner scan = new Scanner(System.in);
        System.out.println("1 -английский 2- итальянcкий 3- немецкий");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                context.getBean("eng", Language.class).getLanguage(dayOfWeek);
                break;
            case 2:
                context.getBean("ital", Language.class).getLanguage(dayOfWeek);
                break;
            case 3:
                context.getBean("germ", Language.class).getLanguage(dayOfWeek);
                break;
        }
        context.close();
    }
}
