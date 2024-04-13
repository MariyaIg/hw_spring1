package com.ignateva.top.hwspring1;

import org.springframework.stereotype.Component;
@Component
public class Italian implements Language{

    @Override
    public void getLanguage(int n) {
        switch (n){
            case 1:System.out.println("Lunedi");break;
            case 2:System.out.println("Martedì");break;
            case 3:System.out.println("Mercoledì");break;
            case 4:System.out.println("Giovedì");break;
            case 5:System.out.println("Venerdì");break;
            case 6:System.out.println("Sabato");break;
            case 7:System.out.println("Domenica");break;
        }
    }
}
