import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Business", "Neil", "19238982Y", 20000);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Business", manager.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Neil", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("19238982Y", manager.getNiNumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(20000, manager.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(20200, manager.raiseSalary(200), 0.0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, manager.payBonus(), 0.0);
    }

}
