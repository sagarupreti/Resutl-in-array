package com.cibt.day3;
import java.util.Scanner;
public class program{

    public static void main(String[] args){
        String[] subjects={"English","Math","science","Account"};
        double[] marks=new double[subjects.length];

        Scanner input=new Scanner(System.in);
        double total=0;
        bollean ifFail=false;

        for(int i=0;i<subjects.length;i++){
            System.out.println("Enter marks for : "+subjects[i]);
                marks[i]=input.nextDouble();
                total +=marks[i];
                if(marks[i] < 32){
                    isFail=true;
                }
                if(isFail==true){
                    System.out.println("you have failed");
                }
        }

    }

}