package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {


        //display countdown from 10-1 ending in Launch!!
        for (int countDown = 10; countDown >= 1; countDown--){
            System.out.println(countDown);

        }
        // displaying messages for this countdown has to be outside of the loop!
        System.out.println("Launch!");

    }
}
