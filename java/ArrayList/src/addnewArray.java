import java.util.ArrayList;
import java.util.List;

public class addnewArray {

    public static void main(String[] args) {

        //creating array list of string
        List<String> animal = new ArrayList<>();

        //adding new element to arraylist

        animal.add("cat");
        //adding an index to array element
        animal.add(1,"cat");

        System.out.println(animal);
    }
}
