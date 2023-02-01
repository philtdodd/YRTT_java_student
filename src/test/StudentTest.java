package test;

import main.Grade;
import main.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student student = new Student("Phil", Grade.F, 1);

        assertEquals("Phil", student.getName());
    }

    @Test
    void getGrade() {
        Student student = new Student("Phil", Grade.F, 1);

        assertEquals(Grade.F, student.getGrade());
    }

    @Test
    void getGroup() {
        Student student = new Student("Phil", Grade.F, 1);

        assertEquals(1, student.getGroup());
    }

    @Test
    void setGroup() {
        Student student = new Student("Phil", Grade.F, 1);

        student.setGroup(2);

        assertEquals(2, student.getGroup());
    }

    @Test
    void upgradeFromF() {
        Student student = new Student("Phil", Grade.F, 1);

        student.upgrade();

        assertEquals(Grade.E, student.getGrade());
    }

    @Test
    void upgradeFromD() {
        Student student = new Student("Phil", Grade.D, 1);

        student.upgrade();

        assertEquals(Grade.C, student.getGrade());
    }

    @Test
    void upgradeFromA() {
        Student student = new Student("Phil", Grade.A, 1);

        student.upgrade();

        assertEquals(Grade.A, student.getGrade());
    }

    @Test
    void downgradeFromA() {
        Student student = new Student("Phil", Grade.A, 1);

        student.downgrade();

        assertEquals(Grade.B, student.getGrade());
    }

    @Test
    void downgradeFromC() {
        Student student = new Student("Phil", Grade.C, 1);

        student.downgrade();

        assertEquals(Grade.D, student.getGrade());
    }

    @Test
    void downgradeFromF() {
        Student student = new Student("Phil", Grade.F, 1);

        student.downgrade();

        assertEquals(Grade.F, student.getGrade());
    }

}