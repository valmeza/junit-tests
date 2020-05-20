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
    }

    @Test
    public void idTest() {
        assertEquals("Valeria", valeria.getName());
        assertEquals(1L, valeria.getId());
    }

    @Test
    public void addGradeTest() {
        valeria.addGrade(90);
        assertSame(90, valeria.getGrades().get(0));
    }

    @Test
    public void gradeAverageTest() {
        gina.addGrade(85);
        gina.addGrade(45);
        valeria.addGrade(90);
        assertEquals(90, valeria.getGradeAverage(), 0);
        assertEquals(65, gina.getGradeAverage(), 0);
    }
}