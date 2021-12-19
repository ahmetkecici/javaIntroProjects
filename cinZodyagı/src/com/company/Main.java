package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;
        String burc="";
        boolean isError = false;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (year > 0) {
            if (year < 2021) {
                switch (year % 12) {
                    case 0:
                        burc = "Maymun";
                        break;
                    case 1:
                        burc = "Horoz";
                        break;
                    case 2:
                        burc = "Köpek";
                        break;
                    case 3:
                        burc = "Domuz";
                        break;
                    case 4:
                        burc = "Fare";
                        break;
                    case 5:
                        burc = "Öküz";
                        break;
                    case 6:
                        burc = "Kaplan";
                        break;
                    case 7:
                        burc = "Tavşan";
                        break;
                    case 8:
                        burc = "Ejderha";
                        break;
                    case 9:
                        burc = "Yılan";
                        break;
                    case 10:
                        burc = "At";
                        break;
                    case 11:
                        burc = "Koyun";
                        break;


                }
            }else{
                isError=true;
            }
        }else {
            isError=true;
        }


     if (isError){
         System.out.println("Hatalı veri girişi");
     }else{
         System.out.println("Burcunuz:"+burc);
     }
    }

}
