import java.util.Comparator;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        Optional<Student> student=Student.getAllStudents().stream().max(Comparator.comparing(Student::getMark));
        System.out.println(student.get());
    }
}
