package com.company;

public class Main {

    public static void main(String[] args) {
        int n=5,result=0;

        int a[]=new int[5];

        a[0]=100;

        a[1]=200;

        a[2]=300;

        a[3]=400;

        a[4]=500;

        for(int i=0;i<n;i++)
            result=result+a[i];

        System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+result/n);


    }
}
