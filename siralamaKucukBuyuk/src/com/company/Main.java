package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        if ((a<b)&&(a<c)){
          if (c>b){
              System.out.println("a<b<c");
          }else{
              System.out.println("a<c<b");
          }
        }else if((b<a)&&(b<c)){
            if (c>a){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        }else {
            if (b>a){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }
    }
}
