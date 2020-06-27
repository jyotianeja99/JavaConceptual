package com.model.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
    private String ename;
    private double salary;

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String ename, double salary) {
        this.ename = ename;
        this.salary = salary;
    }
}



public class StringOddEven {
    public static void main(String args[]){
        Predicate<String> p = s -> s.length()%2==0;
        List<String> list = Arrays.asList("Jyoti","Anejaa","Milestones","Java","Hello");
        for(String ss:list){
            if(p.test(ss)){
                System.out.println(ss);
            }
        }

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Jyoti Aneja",45000));
        empList.add(new Employee("Norin Singla",45000));
        empList.add(new Employee("Chhavi Garg",40000));
        empList.add(new Employee("Shubham K",25000));
        empList.add(new Employee("Rahul Wadhwa",20000));

        Predicate<Employee> pr = e -> e.getSalary()>25000;
        for(Employee emp: empList){
            if(pr.test(emp)){
                System.out.println(emp.getEname());
            }
        }
    }
}
