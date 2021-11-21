package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int a,b;
     double c;
        Scanner scanner =new Scanner(System.in);
        System.out.println("a kenarını giriniz");
        a=scanner.nextInt();
        System.out.println("b kenarını giriniz");
        b=scanner.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("c kenarı yani hipotenüs:"+c);
        double cevre =(a+b+c);
        System.out.println("Üçgenin çevresi:"+cevre );
        double u =cevre/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı: "+alan);
    }
}
