import org.junit.Before;
import org.junit.Test;

import javax.lang.model.util.Types;

import static org.junit.Assert.*;

public class StudentTest {

    Student valeria;
    Student gina;

    @Before
    public void setUp() {
        valeria = new Student(1L, "Valeria");
        gina = new Student(2L, "Gina");
        gina.addGrade(85);
        gina.addGrade(45);
        valeria.addGrade(90);
    }

    @Test
    public void idTest() {
        assertEquals("Valeria", valeria.getName());
        assertEquals(1L, valeria.getId());
    }

    @Test
    public void addGradeTest() {
        assertSame(90, valeria.getGrades().get(0));
    }

    @Test
    public void gradeAverageTest() {
        assertEquals(90, valeria.getGradeAverage(), 0.1);
        assertEquals(65, gina.getGradeAverage(), 0.1);
    }
}