import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Dave", "1029893H", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Dave", employee.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("1029893H", employee.getNiNumber());

    }

    @Test
    public void hasSalary(){
       assertEquals(30000, employee.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30300, employee.raiseSalary(300), 0.0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(300, employee.payBonus(), 0.0);
    }
}
