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
public class TArbolBBTest {
    
    public TArbolBBTest() {
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
     * Test of obtenerTamanio method, of class TArbolBB.
     */
    @Test
    public void testObtenerTamanioVacio() {
        TArbolBB arbol = new TArbolBB();
        int expected = 0;
        assertEquals(arbol.obtenerTamanio(),expected);
    }
    @Test
    public void testObtenerTamanioUnElemento() {
        TArbolBB arbol = new TArbolBB();
        
        TElementoAB nodo1 = new TElementoAB("1",1);
        
        arbol.insertar(nodo1);
        
        int expected = 1;
        assertEquals(arbol.obtenerTamanio(),expected);
    }
    @Test
    public void testObtenerTamanioMultiplesElementos() {
        TArbolBB arbol = new TArbolBB();
        
        TElementoAB nodo1 = new TElementoAB("1",1);
        TElementoAB nodo2 = new TElementoAB("2",2);
        TElementoAB nodo3 = new TElementoAB("3",3);
        
        arbol.insertar(nodo1);
        arbol.insertar(nodo2);
        arbol.insertar(nodo3);
                
        int expected = 3;
        assertEquals(arbol.obtenerTamanio(),expected);
    }
    
}
