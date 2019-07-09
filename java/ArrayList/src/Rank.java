import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Rank {
   /* public static void main(String[] args) {
        List<Student>students=Student.getAllStudents();
        System.out.println(students);
        Collections.sort(students,new StudentRanker());
        System.out.println(students);
    }*/

    public static void main(String[] args) {
        sort();
        sortLamda();
    }

    public static void sort(){
        List<Student>students=Student.getAllStudents();
        //System.out.println(students);
        Collections.sort(students,new StudentRanker());
        //System.out.println(students);

    }

    public static void sortLamda(){
        Comparator<Student>studentComparator=(s1,s2)->(s1.getMark()<s2.getMark()?-1:(s1.getMark()>s2.getMark()?1:0));
        System.out.println(studentComparator);
    }
}
