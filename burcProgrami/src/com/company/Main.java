package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isError = false;
        System.out.println("Doğduğunuz ayı giriniz");
        int month = scanner.nextInt();

        int day = scanner.nextInt();
        String burc="";
        if (month == 1) {
            if (day >= 1 && day < 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day < 28) {
                if (day < 19) {
                    burc = "Kova ";
                } else {
                    burc = "balık ";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day < 31) {
                if (day < 22) {
                    burc = "balık ";
                } else {
                    burc = "Kova ";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day < 31) {
                if (day < 22) {
                    burc = "Koç  ";
                } else {
                    burc = "Boğa  ";
                }
            } else {
                isError = true;
            }
        } else {
            isError=true;
        }
        if (isError){
            System.out.println("Hata yapmışsınınız dönüp bbideha dene");
        }else{
            System.out.println("Burcunuz: "+burc);
        }


    }
}
