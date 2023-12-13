import StudentManagement.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("******* Add Student *******");
        st.addStudent(students, new Student("BH00531", "Nguyen Van A", 1));
        st.addStudent(students, new Student("BH00532", "Nguyen Van B", 3));
        st.addStudent(students, new Student("BH00533", "Nguyen Van C", 8));
        st.addStudent(students, new Student("BH00534", "Nguyen Van D", 6));
        st.addStudent(students, new Student("BH00535", "Nguyen Bao Son", 10));
        System.out.println("List data of students");
        for (Student s : students){
            System.out.println("ID " + s.id +" , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }

        System.out.println("************** Edit Student ***************");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editSudent(students, 0, new Student("BH00531", "Nguyen Van A", 10));
        System.out.println("List data of students");
        for (Student s : students){
            System.out.println("ID " + s.id +" , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }
        System.out.println("************** Edit Student By ID ***************");
        edit.editStudentById(students, "BH00531", new Student("BH00531", "Nguyen Van A", 9.0));
        System.out.println("List data of students after updated by ID");
        for (Student s : students) {
            System.out.println("ID " + s.id + " , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }
        System.out.println("***************** Remove Student By ID **************");
        ArrayListRemoveStudent removeStudent = new ArrayListRemoveStudent();
        removeStudent.removeStudentById(students, "BH00533");
        System.out.println("List data of students after updated by ID");
        for (Student s : students) {
            System.out.println("ID " + s.id + " , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }
        System.out.println("************** Search Student By ID *****************");
        ArrayListSearchStudent searchSt = new ArrayListSearchStudent();
        String numberId = "BH00535";
        int findSt = searchSt.binarySearch(students, numberId);
        if(findSt == -1){
            System.out.println("Cannot found id = " + numberId);
        } else {
            System.out.println("found id = " + numberId);
        }

        System.out.println("************** Sort Student by ID ***************");
        Collections.sort(students, Student.IdStudentComparator);
        System.out.println("********* After sort *************");
        for (Student str : students){
            System.out.println(str);
        }
        System.out.println("************** Sort Student by Full name ***************");
        Collections.sort(students, Student.FullNameStudentComparator);
        System.out.println("********* After sort *************");
        for (Student str : students){
            System.out.println(str);
        }
        System.out.println("************** Sort Student by mark ***************");
        Collections.sort(students, Student.MarkStudentComparator);
        System.out.println("********* After sort *************");
        for (Student str : students){
            System.out.println(str);
        }
    }
}










