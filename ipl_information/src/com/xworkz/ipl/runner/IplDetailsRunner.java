package com.xworkz.ipl.runner;

import com.xworkz.ipl.things.IplDetails;

import java.util.Scanner;

public class IplDetailsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details:");
        System.out.println("Enter the team name:");
        String teamName = scanner.nextLine();
        System.out.println("Enter the captain name:");
        String captainName = scanner.next();
        System.out.println("enter the number of players:");
        int numberOfPlayers = scanner.nextInt();
        System.out.println("enter the number of matches:");
        int numberOfMatches = scanner.nextInt();
        IplDetails iplDetails = new IplDetails();
        iplDetails.teamName=teamName;
        iplDetails.captainName=captainName;
        iplDetails.numberOfPlayers=numberOfPlayers;
        iplDetails.numberOfMatches=numberOfMatches;
        System.out.println("Team Details!!!");
        System.out.println("Team name is:"+teamName);
        System.out.println("Captain name is:"+captainName);
        System.out.println("Number of players:"+numberOfPlayers);
        System.out.println("number of matches:"+numberOfMatches);
    }
}
