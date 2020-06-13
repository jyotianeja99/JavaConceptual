package com.model;

class Car{
    protected void speed(){
        System.out.println("All cars are really fast.");
    }
}

class HondaCity extends Car{
    @Override
    public void speed() {
        System.out.println("Honda City is by far my favorite car and is fast enough too.");  //cannot assign weaker access modifier, instead requires stronger.
    }
}

public class OverridingAccessModifier {
    public static void main(String args[]){
        Car car = new HondaCity();
        car.speed();
    }

}
