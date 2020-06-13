package interfaces;

interface Book{
    public void pages();
    public default void language(){
        System.out.println("All books are supported in English language.");

    }
}

interface Magazine{
    public String title();
    public default void language(){
        System.out.println("All magazines are in Hindi and English as well.!");
    }
}

public class AmbiguousDefaultMethod implements Book, Magazine{
    @Override
    public void pages() {
        System.out.println("The pages count is between 500-700");
    }

    @Override  //This method ia added to remove ambiguity as it's default implementation is inherited from both.interfaces
    public void language() { //comment this method and see the compile time error.
        System.out.println("Supported in English only.");
    }

    @Override
    public String title() {
        return "Magazine and Books title is";
    }

    public static void main(String args[]){



    }

}
