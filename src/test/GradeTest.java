package test;
import main.Grade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeTest {
    @Test
    void upgradeAGrade() {
        Grade grade = Grade.A;

        assertEquals(Grade.A, grade.upgrade());
    }

    @Test
    void upgradeBGrade() {
        Grade grade = Grade.B;

        assertEquals(Grade.A, grade.upgrade());
    }

    @Test
    void upgradeCGrade() {
        Grade grade = Grade.C;

        assertEquals(Grade.B, grade.upgrade());
    }

    @Test
    void upgradeDGrade() {
        Grade grade = Grade.D;

        assertEquals(Grade.C, grade.upgrade());
    }

    @Test
    void upgradeEGrade() {
        Grade grade = Grade.E;

        assertEquals(Grade.D, grade.upgrade());
    }

    @Test
    void upgradeFGrade() {
        Grade grade = Grade.F;

        assertEquals(Grade.E, grade.upgrade());
    }

    @Test
    void downgradeAGrade() {
        Grade grade = Grade.A;

        assertEquals(Grade.B, grade.downgrade());
    }

    @Test
    void downgradeBGrade() {
        Grade grade = Grade.B;

        assertEquals(Grade.C, grade.downgrade());
    }

    @Test
    void downgradeCGrade() {
        Grade grade = Grade.C;

        assertEquals(Grade.D, grade.downgrade());
    }

    @Test
    void downgradeDGrade() {
        Grade grade = Grade.D;

        assertEquals(Grade.E, grade.downgrade());
    }

    @Test
    void downgradeEGrade() {
        Grade grade = Grade.E;

        assertEquals(Grade.F, grade.downgrade());
    }

    @Test
    void downgradeFGrade() {
        Grade grade = Grade.F;

        assertEquals(Grade.F, grade.downgrade());
    }

}