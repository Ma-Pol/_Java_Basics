package programmers.part10;

import java.util.Objects;

public class Student {
    String name;
    String studentNumber;
    int birthYear;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "홍길동";
        student1.studentNumber = "A001";
        student1.birthYear = 1680;

        Student student2 = new Student();
        student2.name = "홍길동";
        student2.studentNumber = "A001";
        student2.birthYear = 1681;

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(studentNumber, student.studentNumber);
    }

    @Override
    public int hashCode() {
        return studentNumber != null ? studentNumber.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name=\"" + name + '\"' +
                ", studentNumber=\"" + studentNumber + '\"' +
                ", birthYear=" + birthYear +
                '}';
    }
}
