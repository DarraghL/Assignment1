import Assignment1.Lecturer;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LecturerTest {


    public LecturerTest(){}

    Lecturer lecturer;

    @BeforeEach
    void setUp() {
        lecturer = new Lecturer("Michael", "", 41, 101);
        lecturer.setDob(LocalDate.of(1981, 02, 28));
        lecturer.setModulesTeaching(new String[]{"CT417", "CS402"});

}
    /**
     * Test of getName method, of class Lecturer.
     */
    @Test
    public void testGetName() {
        assertEquals("Michael", lecturer.getName());
    }

    /**
     * Test of setName method, of class Lecturer.
     */
    @Test
    public void testSetName() {
        lecturer.setName("Frank");
        assertEquals("Frank", lecturer.getName());

    }

    /**
     * Test of getUsername method, of class Lecturer.
     */
    @Test
    public void testGetUsername() {
        assertEquals("Michael41", lecturer.getUsername());
    }

    /**
     * Test of setUsername method, of class Lecturer.
     */
    @Test
    public void testSetUsername() {
        lecturer.setUsername("Frank37");
        assertEquals("Michael41", lecturer.getUsername());
    }

    /**
     * Test of getAge method, of class Lecturer.
     */
    @Test
    public void testGetAge() {
        assertEquals(41, lecturer.getAge());
    }

    /**
     * Test of setAge method, of class Lecturer.
     */
    @Test
    public void testSetAge() {
        lecturer.setAge(37);
        assertEquals(37, lecturer.getAge());
    }

    /**
     * Test of getDob method, of class Lecturer.
     */
    @Test
    public void testGetDob() {
        assertEquals(LocalDate.of(1981, 02, 28), lecturer.getDob());
    }

    /**
     * Test of setDob method, of class Lecturer.
     */
    @Test
    public void testSetDob() {
        lecturer.setDob(LocalDate.of(1988, 11, 13));
        assertEquals(LocalDate.of(1988, 11, 13), lecturer.getDob());
    }

    /**
     * Test of getID method, of class Lecturer.
     */
    @Test
    public void testGetID() {
        assertEquals(101, lecturer.getID());
    }

    /**
     * Test of setID method, of class Lecturer.
     */
    @Test
    public void testSetID() {
        lecturer.setID(102);
        assertEquals(102, lecturer.getID());
    }
    /**
     * Test of getModulesTeaching method, of class Lecturer.
     */
    @Test
    public void testGetModulesTeaching() {
        Assert.assertArrayEquals(new String[]{"CT417", "CS402"}, lecturer.getModulesTeaching());
    }

    /**
     * Test of setModulesTeaching method, of class Lecturer.
     */
    @Test
    public void testSetAssociatedCourses() {
        lecturer.setModulesTeaching(new String[] {"CT123", "CT321"});
        Assert.assertArrayEquals(new String[]{"CT123", "CT321"}, lecturer.getModulesTeaching());
    }

    }

