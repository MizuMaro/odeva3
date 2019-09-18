/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fill.coo.generics;

import junit.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;





public class CollectorTest {
    
    public CollectorTest() {
    } 	
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Collector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Collector instance = new Collector<Apple>("test");
        String expResult = "test";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of description method, of class Collector.
     */
    @Test
    public void testDescription() {
        System.out.println("description");
        Collector instance = new Collector<Apple>("test");
        String expResult = instance.toString() + " carries " + instance.getCarriedObject();;
        String result = instance.description();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of take method, of class Collector.
     * @throws AlreadyCarryingException 
     */
    @Test
    public void testTake() throws AlreadyCarryingException {
        System.out.println("take");
    	Collector<Carrot> collector = new Collector<Carrot>("Collector Carot Test");
		
		assertNull(collector.getCarriedObject());
		Carrot carrot = new Carrot(1);
		try {
			collector.take(carrot);
		} catch (AlreadyCarryingException e) {
			fail(e.getMessage());
		}
		assertNotNull(collector.getCarriedObject());
		assertEquals(carrot, collector.getCarriedObject());
	}
    /**
     * Test of getCarriedObject method, of class Collector.
     */
    @Test
    public void testGetCarriedObject() {
        System.out.println("getCarriedObject");
        Collector instance = new Collector<Apple>("test");
        Object expResult = null;
        Object result = instance.getCarriedObject();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of giveTo method, of class Collector.
     * @throws AlreadyCarryingException 
     */
    @Test
    public void testGiveTo() throws AlreadyCarryingException {
        System.out.println("giveTo");
        Collector<Carrot> collector1 = new Collector<Carrot>("Collector Carot Test");
		Collector<Carrot> collector2 = new Collector<Carrot>("Collector Carot Test");
		Carrot carrot = new Carrot(1);
			collector1.take(carrot);
			collector1.giveTo(collector2);
		
		assertNull(collector1.getCarriedObject());
		assertNotNull(collector2.getCarriedObject());
		assertEquals(carrot, collector2.getCarriedObject());
    }

    /**
     * Test of drop method, of class Collector.
     */
    @Test
    public void testDrop() {
        System.out.println("drop");
        Collector<Carrot> collector = new Collector<Carrot>("Collector Carot Test");
		Carrot carrot = new Carrot(1);
		try {
			collector.take(carrot);
		} catch (AlreadyCarryingException e) {
			fail(e.getMessage());
		}
		
		assertEquals(carrot,  collector.drop());
		assertNull(collector.getCarriedObject());
    }

    /**
     * Test of main method, of class Collector.
     * @throws AlreadyCarryingException 
     */
    @Test
    public void testMain() throws AlreadyCarryingException {
        System.out.println("main");
        String[] args = null;
        Collector.main(args);
    }
    
}
