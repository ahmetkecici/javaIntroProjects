package com.company;

public class MineSwepper {
    public String[][] map;
    int satir , sutun;
    public MineSwepper(int satir, int sutun){
        map=new String[satir][sutun];
        this.satir=satir;
        this.sutun=sutun;
    }
    public void print(){
        for (int i=0; i<satir; i++){
            for (int j = 0; j < sutun; j++) {
                map[i][j]="-";
            }
        }
        for (int i=0; i<satir; i++){
            for (int j = 0; j < sutun; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public void fillTheMap(){

    }


}
