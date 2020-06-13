package lambdaexpression;

//Functional interfaces are those which have only one abstract method and whose definition is provided by the implementing class.
public class FunctionalInterfaceDemo {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Task()); // t1 takes an argument implementing Runnable interface.
        Thread t2 = new Thread(new Runnable() { // t2 takes an anonymous Runnable argument.
            @Override
            public void run() {
                System.out.println("New anonymous thread created.");
            }
        });

        t1.start();
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("Thread created using lambda expression"));
        //here t3 thread object takes a lambda expression as an argument which in turn refers to the run() method of Runnable interface.
        t3.start();
    }

}

class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Task1 is initialized.!");
    }
}
