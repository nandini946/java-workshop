package com.xworkz.instagram.runner;

import com.xworkz.instagram.repository.InstagramUserRepository;
import com.xworkz.instagram.repository.InstagramUserRepositoryImplementation;
import com.xworkz.instagram.things.InstagramUserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramRunner {
    public static void main(String[] args) {
       InstagramUserDetails instagramUserDetails = new InstagramUserDetails();
       instagramUserDetails.setName("Nandini");
       instagramUserDetails.setEmail("Nandini@gamil.com");
       instagramUserDetails.setDateOfBirth(LocalDate.of(2005,12,28));
       instagramUserDetails.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        InstagramUserDetails user1 = new InstagramUserDetails();
        user1.setName("sanju");
        user1.setEmail("sanju@gamil.com");
        user1.setDateOfBirth(LocalDate.of(2005,12,28));
        user1.setCreatedOn(LocalDateTime.now());
        System.out.println(user1.toString());
        InstagramUserDetails user2 = new InstagramUserDetails();
        user2.setName("deesha");
        user2.setEmail("deesha@gamil.com");
        user2.setDateOfBirth(LocalDate.of(2005,12,28));
        user2.setCreatedOn(LocalDateTime.now());
        System.out.println(user1.toString());
        InstagramUserDetails user3 = new InstagramUserDetails();
        user3.setName("ammu");
        user3.setEmail("ammu@gamil.com");
        user3.setDateOfBirth(LocalDate.of(2005,12,28));
        user3.setCreatedOn(LocalDateTime.now());
        System.out.println(user1.toString());
        System.out.println("Welcome to Instagram!!!");
        InstagramUserRepository repo =  new InstagramUserRepositoryImplementation();
        repo.saveUserDetails(instagramUserDetails);
        repo.saveUserDetails(user1);
        repo.saveUserDetails(user2);
        repo.saveUserDetails(user3);
        repo.readinstagramUser();
        repo.findUserDetails("Deesha","deesha@gmail.com");


    }
}
