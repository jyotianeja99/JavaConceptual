package interfaces;

interface Person{
    public default void gender(){
        System.out.println("Any Gender for this role.");
    }
}

interface Student{
    public default void whichStudent(){
        System.out.println("School student");
    }
}

public class InterfaceDemo implements Person,Student{
    public static void main(String args[]){
        InterfaceDemo i = new InterfaceDemo();
        i.gender();;
        i.whichStudent();
        System.out.println("This commit is only to get into a new branch to have a PR");



    }
}
