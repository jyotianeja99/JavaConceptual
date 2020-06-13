package com.model;

 class Animal{

     public void move(){
         System.out.println("All animals move, none of them flies.!");
     }
 }

 class Tiger extends Animal{
     @Override
     public void move() {
         System.out.println("Tiger moves really fast.");
     } //can be public but not private
 }

public class MethodOverriding {
     public static void main(String args[]){
         Animal a = new Tiger();
         Tiger t = new Tiger();
         a.move();
         t.move(); // the move() of Tiger class gets invoked.
     }
 }
