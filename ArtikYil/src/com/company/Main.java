package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        String message;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (year > 0) {
            if (year < 2021) {
              if (year%100==0){
                if (year%400==0)  message=year+" artık yıldır";
                else message="Artık yıl değil";
              }else if (year%4==0){
                  message=year+" artık yıldır";
              }else {
                  message="Bu bi artık yıl değil";
              }
            }else  message="Hatalı veri girişi";
            }else {
               message="Hatalı veri girişi";
        }
        System.out.println(message);
    }

}
