import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(10000, "France", "Tony", "243231Y", 20000);
    }

    @Test
    public void hasDeptName(){
        assertEquals("France", director.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Tony", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("243231Y", director.getNiNumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(20000, director.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(20200, director.raiseSalary(200), 0.0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(10000, director.getBudget(),0.0);
    }

}
