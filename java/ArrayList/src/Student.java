import java.util.ArrayList;
import java.util.List;

public class Student {

       private String name;
       private double marks;

    public double getMarks() {
        return marks;
    }

    //constructor
        Student(String name,double marks){
            this.name=name;
            this.marks=marks;

        }

    public Student() {
    }

    public static List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("saman", 87.5));
        students.add(new Student("kumanan", 84.5));
        students.add(new Student("kajee", 43.5));
        students.add(new Student("nilan", 85.5));
        students.add(new Student("gayan", 87.5));
        students.add(new Student("kavuri", 84.5));
        students.add(new Student("sajith", 43.5));
        students.add(new Student("sugashan", 85.5));
        students.add(new Student("jamuna", 43.5));
        students.add(new Student("shylucca", 85.5));


       // students.forEach(Student -> {
       //     System.out.println("Name : " + Student.getName() + ", Marks : " + Student.getMark());
      //  });
        //students.forEach(Student->{
        //     System.out.println("Name:"+Student.getName()+"marks:"+Student.getMark());
        //  });
         return students;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
        }



