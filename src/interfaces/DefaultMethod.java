package interfaces;

interface Fruit{
    public void type();
    default void taste(){
        System.out.println("All fruits are sweet");

    }
}

class Mango implements Fruit{
    public void type(){
        System.out.println("Mango is a summer fruit");
    }

    public void taste(){
        System.out.println("Mango tastes both sweet and sour.!");
    }
}

class Banana implements Fruit{
    public void type(){
        System.out.println("Banana is a summer fruit and is very sweet.!");
    }
}

class WaterMelon implements Fruit{
    public void type(){
        System.out.println("WaterMelon is a summer fruit and is very sweet.!");
    }
}

public class DefaultMethod {
    public static void main(String args[]){
        Fruit mango = new Mango();
        Fruit banana = new Banana();
        WaterMelon waterMelon = new WaterMelon();
        mango.taste();  //calls taste method defined in the Mango class.
        banana.taste(); //calls taste method defined in interface as no explicit definition is given.
        waterMelon.taste(); //calls taste method defined in interface as no explicit definition is given.

    }

}
