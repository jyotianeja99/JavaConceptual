package com.model;

class Work{
    public void type(){
        System.out.println("Type of work is general.!");
    }
}

class Engineer extends Work{

    @Override
    public void type() throws ArithmeticException {  //cannot throw Exception, will give compile time error.
        System.out.println("Engineers can make: "+ 34/0+" possible.");
    }
}

public class OverrideMethodWithNoException {
    public static void main(String args[]) {
    Work e = new Engineer();
    e.type();


}

}
