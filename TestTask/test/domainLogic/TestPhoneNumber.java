package domainLogic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Fabian
 */
public class TestPhoneNumber {

    public TestPhoneNumber() {
    }

    /**
     * Test of toString method, of class PhoneNumber.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PhoneNumber instance = new PhoneNumber("78121234567");
        String expResult = "+7 (812) 123-4567";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class PhoneNumber.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        PhoneNumber instance1 = new PhoneNumber("78121234567");
        PhoneNumber instance2 = new PhoneNumber("78121234567");
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testNotEquals() {
        System.out.println("equals");
        PhoneNumber instance1 = new PhoneNumber("78121234567");
        PhoneNumber instance2 = new PhoneNumber("78121234568");
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCreatePhoneNumber1() {
        System.out.println("create1");
        PhoneNumber instance1 = new PhoneNumber("1234567");
        String expResult = "+7 (812) 123-4567";
        String result = instance1.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreatePhoneNumber2() {
        System.out.println("create2");
        PhoneNumber instance1 = new PhoneNumber("0001234567");
        String expResult = "+7 (000) 123-4567";
        String result = instance1.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreatePhoneNumber3() {
        System.out.println("create3");
        PhoneNumber instance1 = new PhoneNumber("91234567");
        String expResult = "+9 (812) 123-4567";
        String result = instance1.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreatePhoneNumber4() {
        System.out.println("create4");
        PhoneNumber instance1 = new PhoneNumber("01231234567");
        String expResult = "+0 (123) 123-4567";
        String result = instance1.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreatePhoneNumber5() {
        System.out.println("create5");
        PhoneNumber instance1 = new PhoneNumber("012312345678");
        String expResult = "";
        String result = instance1.toString();
        assertEquals(expResult, result);
    }
}
