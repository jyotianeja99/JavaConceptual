package com.model;

enum Technology{JAVA, SPRING, STRUTS, HIBERNATE, SPRINGBOOT, JUNIT}

public class EnumDemo {

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    Technology technology;

    public EnumDemo(Technology t) {
        this.technology = t;
    }

    public static void main(String args[]){
        EnumDemo e = new EnumDemo(Technology.JAVA);
        EnumDemo ee = new EnumDemo(Technology.SPRINGBOOT);
        System.out.println(e.getTechnologyDescription());
        System.out.println(ee.getTechnologyDescription());

    }

    public String getTechnologyDescription(){

        Technology t = this.getTechnology();
        switch(t){
            case JAVA:
                return "Java is an object oriented language.!";
            case SPRING:
                return "SPRING is a new java framework created to manage bean instantiation";
            case STRUTS:
                return "STRUTS is an older and simpler framework of java";
            case HIBERNATE:
                return "Hibernate is an ORM tool for connecting java applications to the database.";
            case SPRINGBOOT:
                return "SpringBoot is an enhanced version of Spring";
            case JUNIT:
                return "Junit is used for unit testing the java modules and classes.";

        }

        return null;
    }


}

