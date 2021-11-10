import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Neil", "19238982Y", 20000);
    }



    @Test
    public void hasName(){
        assertEquals("Neil", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("19238982Y", developer.getNiNumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(20000, developer.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(20200, developer.raiseSalary(200), 0.0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, developer.payBonus(), 0.0);
    }

}

