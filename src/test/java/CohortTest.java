import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testIfAddStudentWorks() {
        Cohort apex = new Cohort();
        Student val = new Student(1L, "Valeria");
        apex.addStudent(val);
        assertEquals(1L,apex.getStudents().get(0).getId());

        // Test name
        assertEquals("Valeria", apex.getStudents().get(0).getName());
    }

    @Test
    public void testIfGetStudentsWorks() {
        // make sure it zero at the start
        Cohort apex = new Cohort();
        assertEquals(0, apex.getStudents().size());

        Student val = new Student(2L, "Valeria");
        apex.addStudent(val);
        assertEquals(1, apex.getStudents().size());
    }

    @Test
    public void testIfAverageWorks() {
        Cohort apex = new Cohort();
        Student val = new Student(2L, "Valeria");
        val.addGrade(100);
        val.addGrade(50);
        apex.addStudent(val);
        assertEquals(75, apex.getCohortAverage(), 0);
    }
}
