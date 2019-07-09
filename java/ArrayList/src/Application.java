import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        withoutStream();
        //stream();
    }

    private static void withoutStream() {
        List<Student> students = Student.getAllStudents();
        System.out.println("Total number of students: "+ students.size());
        //objects
        List<Student> newStudent = new ArrayList<>();
         //create the new student object and assigned it for students
        for (Student student : students) {//new object student getmark>80
            if (student.getMark() > 80) {//Add those to arraylist
                newStudent.add(student);
            }
        }
        System.out.println("marks above 80 : " + " " + newStudent.size());
      }


     /*public static void stream(){
        List<Student>students=Student.getAllStudents().stream().filter(s->s.getName().contains("i")).collect(Collectors.toList());
            System.out.println("number of names with "+"i" +" letter:"+students.size());


            //List<Student>student=Student.getAllStudents().stream().filter(s->s.getMark()>80).map(s->s.getName()+"Eng:").collect()


          students=Student.getAllStudents().
         stream().filter(s->s.getName().endsWith("n")).collect(Collectors.toList());
         System.out.println(students.size());

}*/




}