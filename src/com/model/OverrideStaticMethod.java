package com.model;

class Bird{

    public static void fly(){
        System.out.println("All birds fly.");

    }

}

class Peacock extends Bird{

    public static void fly(){   //no @Override, as the method is hidden.
        System.out.println("Peacock flies at low heights.!");
    }
}

public class OverrideStaticMethod {
    public static void main(String args[]) {
        Bird b = new Peacock();
        b.fly(); //output will shock you.
        Peacock.fly();

    }

}
