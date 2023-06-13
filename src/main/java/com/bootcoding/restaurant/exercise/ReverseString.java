package com.bootcoding.restaurant.exercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        for(int i=0;i<a.length/2;i++){
            String temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }

        String s1=a.toString();


        System.out.println(s1);


    }

}
