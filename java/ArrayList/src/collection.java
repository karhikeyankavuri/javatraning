import java.util.ArrayList;
import java.util.List;

public class collection {
    public static void main(String[] args) {

        //creating array list of string

        List<String>students=new ArrayList<>();

        students.add("kavuri");
        // Creating an ArrayList from another collection

        List<String>tution=new ArrayList<>(students);
        students.add("priya");

        // Adding an entire collection to an ArrayList
        tution.addAll(students);

        System.out.println(tution);
    }
}
