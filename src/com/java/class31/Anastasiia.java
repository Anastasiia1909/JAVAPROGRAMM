package com.java.class31;

import java.util.Scanner;

public class AirlainProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now, you can see all information about your fly. Please, enter - ok");
        String answer = sc.nextLine();
        while (!(answer.equalsIgnoreCase("ok"))) {
            System.out.println("Your input is incorrect! Please enter OK ");
            answer = sc.nextLine();

/*
            System.out.println("************************************************************************");
                System.out.println("Your flight: "+ \n cityDep +"-" cityArriv ); //User stories 1+2
                System.out.println("Total Price = $" + price);       //+US 3 +
                System.out.println("Date:" + dataTicket);            //UStory  - 4
                System.out.println("Number of travelers: " + adults + children);     //User Story -5
                System.out.println("Tickets class: " + classTicket );    // User Story -6
                System.out.println("Type of flight: " + direct or connecting);  // User story -7
                System.out.println("Baggage: " + getCarryOn + getLuggage + getAdditionToTicketPrice); //+US -8 +


*/
            System.out.println("************************************************************************");

        }
    }
}


