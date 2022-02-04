package com.company.epam.training.Mykyta_Zemka.MainTask;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            StringBuffer asd = new StringBuffer(sc.nextLine());
            asd.reverse();
            System.out.println("Reverse: " + asd.toString());
        }
    }
}
