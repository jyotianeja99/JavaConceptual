package interfaces;

interface Country{
    public void size();
    public default void scenic(){
        System.out.println("ALl countries have a good geographic");
    }
    public static void location(){
        System.out.println("Country is located, anywhere except North America");
    }
}

interface Continent{
    public void size();
    public static void location(){
        System.out.println("Continent is located in upper half of the world");
    }
    public default void scenic(){
        System.out.println("ALl continents have a good geographic and water as well");
    }
}

public class StaticMethodInterface implements Continent, Country{
    public static void main(String args[]){
        Country.location(); //static methods cannot be overridden in implementation class.
        Continent.location(); // static methods will always be invoked using Class not instance, so no ambiguity.
        new StaticMethodInterface().scenic();

    }

    @Override
    public void size() {

    }

    @Override
    public void scenic() {
        System.out.println("This method had to be implemented because there's ambiguity as it is defined in both interfaces");
    }
}
