package StudentManagement;

import java.util.Collection;
import java.util.Comparator;

public class Student {
    public String fullname;
    public String id;
    public double marks;
    public String rank;

    public Student(String id, String fullname, double marks) {
        this.id = id;
        this.fullname = fullname;
        this.marks = marks;
        if (this.marks >= 0 && this.marks < 5) {
            this.rank = "Fail";
        } else if (this.marks >= 5 && this.marks < 6.5) {
            this.rank = "Medium";
        } else if (this.marks >= 6.5 && this.marks < 7.5) {
            this.rank = "Good";
        } else if (this.marks >= 7.5 && this.marks < 9) {
            this.rank = "Very good";
        } else if (this.marks >= 9 && this.marks <= 10) {
            this.rank = "Excellent";
        }
    }
    // getter and setter java

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static Comparator<Student> IdStudentComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            String idStudent1 = o1.getId().toUpperCase();
            String idStudent2 = o2.getId().toUpperCase();
            return idStudent1.compareTo(idStudent2);
        }
    };
    public static Comparator<Student> FullNameStudentComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            String FullNameStudent1 = o1.getFullname().toUpperCase();
            String FullNameStudent2 = o2.getFullname().toUpperCase();
            return FullNameStudent1.compareTo(FullNameStudent2);
        }
    };
    public static Comparator<Student> MarkStudentComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            double MarkStudent1 = o1.getMarks();
            double MarkStudent2 = o2.getMarks();
            if(MarkStudent1 < MarkStudent2){
                return -1;
            } else if (MarkStudent2 < MarkStudent1) {
                return 1;
            }
            return 0;
        }
    };
    @Override
    public String toString() {
        return "[ID = "+ id +" , fullName = " + fullname + ", mark = " + marks + " , rank  = " + rank + " ]";
    }
}

