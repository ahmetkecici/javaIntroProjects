package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz");
        int heat=scanner.nextInt();

        if (heat<5){
            System.out.println("Kayak yap");
        }else if(heat>5&&heat<10){
            System.out.println("sinemaya git");
        }else if(heat>10&&heat<15){
            System.out.println("Hem sinema hem piknik");
        }else if(heat>15&&heat<25){
            System.out.println("Piknik");
        }else{
            System.out.println("Yüzme");
        }
    }
}
