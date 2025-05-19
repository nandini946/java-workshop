package com.xworkz.instagram.repository;

import com.xworkz.instagram.things.InstagramUserDetails;

public interface InstagramUserRepository {
    void saveUserDetails(InstagramUserDetails details);
   void readinstagramUser( );
   void findUserDetails(String name);
    void findUserDetails(String name,String email);
}
