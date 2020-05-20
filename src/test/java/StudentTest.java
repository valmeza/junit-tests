import org.junit.Before;
import org.junit.Test;

import javax.lang.model.util.Types;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void idTest() {
        Student valeria = new Student(1, "Valeria");

        assertEquals("Valeria", valeria.getName());
        assertEquals(1, valeria.getId());
    }

    @Test
    public void addGradeTest() {
        Student valeria = new Student(1, "Valeria");
        valeria.addGrade(90);
        assertSame(90, valeria.getGrades().get(0));
    }

    @Test
    public void gradeAverageTest() {
        Student valeria = new Student(1, "Valeria");
        Student gina = new Student(2, "Gina");
        gina.addGrade(85);
        gina.addGrade(45);
        valeria.addGrade(90);
        assertEquals(90, valeria.getGradeAverage(), 0);
        assertEquals(65, gina.getGradeAverage(), 0);
    }
}