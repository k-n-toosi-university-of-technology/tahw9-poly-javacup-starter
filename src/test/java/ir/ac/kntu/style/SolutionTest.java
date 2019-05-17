/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.javacup.oo.A;
import ir.javacup.oo.B;
import ir.javacup.oo.C;
import ir.javacup.oo.D;
import java.lang.reflect.Method;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 50 points
 * @author Hamed Khashehchi
 */
public class SolutionTest {

    static boolean canTest = true;

    @BeforeClass
    public static void testStyles() {
        boolean testPMDInternal = CheckPMDTest.testPMDViolation();
        boolean testCPDInternal = CheckPMDTest.testCPDViolation();
        boolean testCheckStyleInternal = CheckStyleTest.testCheckStyleViolation();
        canTest = !testCheckStyleInternal && !testPMDInternal && !testCPDInternal;
    }

    @Test
    public void testAMethod1() {
        Assert.assertTrue(canTest);
        assertEquals("A1", new A().method1());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testAMethod2() {
        Assert.assertTrue(canTest);
        assertEquals("A2", new A().method2());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testBMethod1() {
        Assert.assertTrue(canTest);
        assertEquals("A1", new B().method1());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testBMethod2() {
        Assert.assertTrue(canTest);
        assertEquals("A1B2", new B().method2());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testCMethod1() {
        Assert.assertTrue(canTest);
        assertEquals("C1", new C().method1());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testCMethod2() {
        Assert.assertTrue(canTest);
        assertEquals("C1B2", new C().method2());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testDMethod1() {
        Assert.assertTrue(canTest);
        assertEquals("D1", new D().method1());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testDMethod2() {
        Assert.assertTrue(canTest);
        assertEquals("D1B2", new D().method2());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }
//8
    @Test
    public void testInheritance1() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> b = Class.forName("ir.javacup.oo.B");
        Class<?> c = Class.forName("ir.javacup.oo.C");
        Class<?> d = Class.forName("ir.javacup.oo.D");
        assertTrue(b.isAssignableFrom(d));
        assertTrue(b.isAssignableFrom(c));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testInheritance2() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> a = Class.forName("ir.javacup.oo.A");
        Class<?> b = Class.forName("ir.javacup.oo.B");
        Class<?> c = Class.forName("ir.javacup.oo.C");
        Class<?> d = Class.forName("ir.javacup.oo.D");
        assertTrue(a.isAssignableFrom(b));
        assertTrue(a.isAssignableFrom(c));
        assertTrue(a.isAssignableFrom(d));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testAMethods() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> a = Class.forName("ir.javacup.oo.A");
        Method[] methods = a.getDeclaredMethods();
        assertEquals(2, methods.length);
        boolean hasMethod1 = false;
        boolean hasMethod2 = false;
        for (int i = 0; i < 2; i++) {
            if ("method1".equals(methods[i].getName())) {
                hasMethod1 = true;
                assertEquals("class java.lang.String", methods[i].getReturnType().toString());
            } else if ("method2".equals(methods[i].getName())) {
                hasMethod2 = true;
                assertEquals("class java.lang.String", methods[i].getReturnType().toString());
            }
        }
        assertTrue(hasMethod1);
        assertTrue(hasMethod2);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testBMethods() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> b = Class.forName("ir.javacup.oo.B");
        Method[] methods = b.getDeclaredMethods();
        assertEquals(1, methods.length);
        assertEquals("method2", methods[0].getName());
        assertEquals("class java.lang.String", methods[0].getReturnType().toString());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testCMethods() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> a = Class.forName("ir.javacup.oo.C");
        Method[] methods = a.getDeclaredMethods();
        assertEquals(1, methods.length);
        assertEquals("method1", methods[0].getName());
        assertEquals("class java.lang.String", methods[0].getReturnType().toString());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testDMethods() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> d = Class.forName("ir.javacup.oo.D");
        Method[] methods = d.getDeclaredMethods();
        assertEquals(1, methods.length);
        assertEquals("method1", methods[0].getName());
        assertEquals("class java.lang.String", methods[0].getReturnType().toString());
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");

    }

    @Test
    public void testAFields() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> a = Class.forName("ir.javacup.oo.A");
        assertEquals(0, a.getDeclaredFields().length);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testBFields() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> b = Class.forName("ir.javacup.oo.B");
        assertEquals(0, b.getDeclaredFields().length);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testCFields() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> c = Class.forName("ir.javacup.oo.C");
        assertEquals(0, c.getDeclaredFields().length);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }

    @Test
    public void testDFields() throws ClassNotFoundException {
        Assert.assertTrue(canTest);
        Class<?> d = Class.forName("ir.javacup.oo.D");
        assertEquals(0, d.getDeclaredFields().length);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Passed.\" } | $$$GRADER$$$");
    }
}
