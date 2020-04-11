/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author Manahil Khalid
 */
public class CalculatorMainClassTest {
    
    public CalculatorMainClassTest() {
    }
   
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    CalculatorMainClass c1;
    @Before
    public void setUp() {
        System.out.println("Before method call");
         c1=new CalculatorMainClass();
    }
    
    @After
    public void tearDown() {
         System.out.println("After method call");
        int num1=0;
        int num2=0;
    }
    
    
    
    @RunWith(Parameterized.class)
    public class ParameterizedAdditionTest {
        int expected;
        int num1;
        int num2;
    public ParameterizedAdditionTest (int expectedResult, int firstNumber,
            int secondNumber) {
        System.out.println("addition parameterized passed");
        expected = expectedResult;
        num1 = firstNumber;
        num2 = secondNumber;
    }
    }
    
    @Parameters
    public Collection<Integer[]> addition() {
        System.out.println("addition parameterized passed");
        return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
                { 7, 3, 4 }, { 9, 4, 5 }, });
    }
    

    /**
     * Test of addition method, of class CalculatorMainClass.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int num1 = 1;
        int num2 = 1;
        int expResult = 2;
        int result = c1.addition(num1, num2);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testAdditionTrue() {
        System.out.println("addition True");
        assertTrue(c1.addition(2, 3)==5);
    }
    
     @Test
    public void testAdditionFalse() {
        System.out.println("addition False");
        assertFalse(c1.addition(2, 3)==-1);
    }
    
    

    /**
     * Test of subtraction method, of class CalculatorMainClass.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int num1 = 2;
        int num2 = 1;
        int expResult = 1;
        int result = c1.subtraction(num1, num2);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSubtractionTrue() {
        System.out.println("subtraction True");
        assertTrue(c1.subtraction(2, 3)==-1);
    }
    
    @Test
    public void testSubtractionFalse() {
        System.out.println("subtraction False");
        assertFalse(c1.subtraction(2, 3)==1);
    }
    
    
    
    /**
     * Test of multiplication method, of class CalculatorMainClass.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int num1 = 5;
        int num2 = 2;
        int expResult = 10;
        int result = c1.multiplication(num1, num2);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testMultiplicationTrue() {
        System.out.println("multiplication True");
        assertTrue(c1.multiplication(2, 3)==6);
    }
    
    
    @Test
    public void testMultiplicationFalse() {
        System.out.println("multiplication False");
        assertFalse(c1.multiplication(2, 3)==-1);
    }

    /**
     * Test of division method, of class CalculatorMainClass.
     */
    @Test
    public void testDivision() {
         System.out.println("division");
        int num1 = 4;
        int num2 = 2;
        int expResult = 2;
        int result = (int) c1.division(num1, num2);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testDivisionTrue() {
        System.out.println("division True");
        assertTrue(c1.division(3, 3)==1);
    }
    
    @Test
    public void testDivisionFalse() {
        System.out.println("division False");
        assertFalse(c1.division(2, 3)==-1);
    }
}
