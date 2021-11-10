import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Neil", "19238982Y", 20000);
    }



    @Test
    public void hasName(){
        assertEquals("Neil", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("19238982Y", databaseAdmin.getNiNumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(20200, databaseAdmin.raiseSalary(200), 0.0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0.0);
    }
}
