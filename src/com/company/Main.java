package com.company;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Type x");
        x=sc.nextInt();
        System.out.println("Type y");
        int y;
        y=sc.nextInt();
        System.out.println("Type y");
        if (x==y){System.out.println("Try more");}
        else if (x>y){y=(x+y)/2; x=2*x*y;}
        else{x=(x+y)/2; y=2*x*y;}
        System.out.println(x);
        System.out.println(y);
    }
}
