package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yaricap,aci;
        double pi=3.14;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");


        yaricap=scanner.nextInt();
        System.out.println("Dairenin merkez açısını giriniz");


        aci=scanner.nextInt();
        double alan=pi*yaricap*yaricap;
        double cevre=2*pi*yaricap;
        alan=(pi*(yaricap*yaricap)*aci)/360;
        System.out.println("çevre :"+cevre);
        System.out.println("alan :"+alan);


    }
}
