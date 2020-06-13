package com.model;

class A{
    public void a() throws RuntimeException{
        System.out.println("Hello World.!");
    }
}

class B extends A{
    @Override
    public void a() throws RuntimeException {
        super.a();
    }

    public void b() throws Exception{
        System.out.println("Hello great world.!");
    }

}

public class ExceptionRuleTwo {
    public static void main(String args[]) {
        A aa = new B();
        aa.a();
    }
}
