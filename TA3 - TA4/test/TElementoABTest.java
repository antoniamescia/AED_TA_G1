/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Néstor
 */
public class TElementoABTest {
    
    public TElementoABTest() {
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
     * Test of getHijoIzq method, of class TElementoAB.
     */
    @Test
    public void testGetHijoIzq() {
        System.out.println("getHijoIzq");
        TElementoAB instance = null;
        TElementoAB expResult = null;
        TElementoAB result = instance.getHijoIzq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoDer method, of class TElementoAB.
     */
    @Test
    public void testGetHijoDer() {
        System.out.println("getHijoDer");
        TElementoAB instance = null;
        TElementoAB expResult = null;
        TElementoAB result = instance.getHijoDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TElementoAB.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TElementoAB instance = null;
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TElementoAB.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TElementoAB instance = null;
        TElementoAB expResult = null;
        TElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TElementoAB.
     */
    @Test
    public void testInOrden_0args() {
        System.out.println("inOrden");
        TElementoAB instance = null;
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TElementoAB.
     */
    @Test
    public void testInOrden_Lista() {
        System.out.println("inOrden");
        TElementoAB instance = null;
        instance.inOrden(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtiqueta method, of class TElementoAB.
     */
    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        TElementoAB instance = null;
        Comparable expResult = null;
        Comparable result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class TElementoAB.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        TElementoAB instance = null;
        String expResult = "";
        String result = instance.imprimir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class TElementoAB.
     */
    @Test
    public void testGetDatos() {
        System.out.println("getDatos");
        TElementoAB instance = null;
        Object expResult = null;
        Object result = instance.getDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoIzq method, of class TElementoAB.
     */
    @Test
    public void testSetHijoIzq() {
        System.out.println("setHijoIzq");
        TElementoAB instance = null;
        instance.setHijoIzq(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoDer method, of class TElementoAB.
     */
    @Test
    public void testSetHijoDer() {
        System.out.println("setHijoDer");
        TElementoAB instance = null;
        instance.setHijoDer(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAltura method, of class TElementoAB.
     */
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        TElementoAB instance = null;
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTamanio method, of class TElementoAB.
     */
    @Test
    public void testObtenerTamanio() {
        System.out.println("obtenerTamanio");
        TElementoAB instance = null;
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNivel method, of class TElementoAB.
     */
    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        TElementoAB instance = null;
        int expResult = 0;
        int result = instance.obtenerNivel(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantidadHojas method, of class TElementoAB.
     */
    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TElementoAB instance = null;
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
