/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Om
 */
public class TriangleTest {
    
    public TriangleTest() {
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
     * Test of setA method, of class Triangle.
     */
    @Test
    public void testSetA() {
        
        int side1 = 10;
        Triangle instance1 = new Triangle(7, 8, 9);
        instance1.setA(10);
        int actual = instance1.getA();
        assertEquals(side1, actual);
        
    }

    /**
     * Test of setB method, of class Triangle.
     */
    @Test
    public void testSetB() {
        int side2 = 10;
        Triangle instance1 = new Triangle(7, 8, 9);
        instance1.setB(10);
        int actual = instance1.getB();
        assertEquals(side2, actual);
        
        
    }

    /**
     * Test of setC method, of class Triangle.
     */
    @Test
    public void testSetC() {
        int side3 = 10;
        Triangle instance1 = new Triangle(7, 8, 9);
        instance1.setC(10);
        int actual = instance1.getC();
        assertEquals(side3, actual);
        
        
    }

    /**
     * Test of getA method, of class Triangle.
     */
    @Test
    public void testGetA() {
        
        Triangle instance = new Triangle(7, 8, 9);
        int expResult = 7;
        int result = instance.getA();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getB method, of class Triangle.
     */
    @Test
    public void testGetB() {
        
        Triangle instance = new Triangle(7, 8, 9);
        int expResult = 8;
        int result = instance.getB();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getC method, of class Triangle.
     */
    @Test
    public void testGetC() {
        
        Triangle instance = new Triangle(7, 8, 9);
        int expResult = 9;
        int result = instance.getC();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validateTriangle method, of class Triangle.
     * I used decision coverage
     */
    @Test
    public void testValidateTriangle1() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(-1, 4, 5);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidateTriangle2() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(201, 4, 5);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidateTriangle3() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(3,-1, 5);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidateTriangle4() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(3,201,5);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidateTriangle5() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(3,4,-1);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidateTriangle6() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(3,4,201);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle7() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(10,3,4);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle8() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(3,10,4);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle9() {
        System.out.println("validateTriangle");
        Triangle instance = new Triangle(4,3,10);
        String expResult = "NotATriangle";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle10() {
        System.out.println("Equilateral Triangle");
        Triangle instance = new Triangle(8,8,8);
        String expResult = "Equilateral";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle11() {
        System.out.println("iscoceles Triangle");
        Triangle instance = new Triangle(6,6,9);
        String expResult = "iscoceles";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle12() {
        System.out.println("scalene Triangle");
        Triangle instance = new Triangle(5,6,7);
        String expResult = "scalene";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidateTriangle13() {
        System.out.println("RightAngeledTriangle");
        Triangle instance = new Triangle(5,12,13);
        String expResult = "rightangled";
        String result = instance.validateTriangle();
        assertEquals(expResult, result);
        
    }
    
}
