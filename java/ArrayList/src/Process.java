import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Process {
    public static void main(String[] args) {

        //print all students
       List< Student> student= Student.getAllStudents().stream().collect(Collectors.toList());
        System.out.println(student);
        //student.stream().forEach(System.out::println);

       // List<Student>students=Student.getAllStudents().stream()
     //           .map(s->new Student("Eng"+s.getName(),s.getMark())).collect(Collectors.toList());

     //   for (Student student:students) {
       //     System.out.println(student.getName());
        }

    }

