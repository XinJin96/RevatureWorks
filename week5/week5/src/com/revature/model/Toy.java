package com.revature.model;

public class Toy {
   protected String name;

   public Toy() {}
   //constructor
   public Toy(String name) {
     this.name = name;
   }

   //getters and setters
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

    //additional methods/behaviors all toys should have
    public void play() {
      System.out.println("This is fun!");
      System.out.println("Running the Toy class's play method.");
    } 
}