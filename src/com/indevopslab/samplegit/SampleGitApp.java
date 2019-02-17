package com.indevopslab.samplegit;

import com.indevopslab.samplegit.model.User;

public class SampleGitApp {
    
    private static User user = new User();

    public static void main(String[] args) {
        
      System.out.println("====>Starting");
      user.setName("Gaspard");
      System.out.println("Hello World, from InDevOpsLab");
      System.out.println( user.getName() + " is loving it! " );

    }
}
