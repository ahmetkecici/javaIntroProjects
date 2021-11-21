package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  double price;
      Scanner scanner=new Scanner(System.in);
      price= scanner.nextDouble();
      double kdv=price>=1000?1.08:1.18;
      double totalPrice=price*kdv;
        System.out.println("Kdv oranı:"+kdv +" Toplam fiyat:" +totalPrice);
    }
}
