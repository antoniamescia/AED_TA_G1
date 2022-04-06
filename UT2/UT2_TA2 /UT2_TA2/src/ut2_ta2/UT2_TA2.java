/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut2_ta2;
import java.lang.UnsupportedOperationException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author antoniamescia
 */
public class UT2_TA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorialIterativo(6));
        System.out.println(factorialPrep(5));
        System.out.println(Arrays.toString(fibonacciLineal(6)));
        System.out.println(fibonacciBinarioPrep(5));
        System.out.println(cantVecesFiboBinario);
    }
    
    public static int factorialIterativo(int n){
        int fact = n;
        
        if(n == 0){
            fact = 1;
        } 
        
        while (n>1) {            
            n = n-1;
            fact = fact*n;
        }
        return fact;
    }   
    
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int factorialPrep(int n) throws UnsupportedOperationException {
        if (n < 0) {
            throw new UnsupportedOperationException("No puede calcularse el factorial de un número negativo");
        }
        return factorial(n);
    }
    
    public static int[] fibonacciLineal(int k) {
        int[] res = new int[2];

        // Chequear condición de entrada
        if (k < 1) {
            System.out.println("No hay número de Fibonacci.");
        }
        // Caso base
        if (k == 1) {
            res[0] = k;
            res[1] = 0;
            return res;
        }

        res = fibonacciLineal(k - 1);
        int i = res[0];
        res[0] = res[0] + res[1];
        res[1] = i;

        return res;

    }
    
    private static int cantVecesFiboBinario = 0;
    
    public static int fibonacciBinario(int k) {
        cantVecesFiboBinario++;
        if (k == 0 || k == 1) {
            return k;
        }
        
        return fibonacciBinario(k - 1) + fibonacciBinario(k - 2);
    }
    
    public static int fibonacciBinarioPrep(int k) {
        cantVecesFiboBinario = 0;
        if (k < 0) {
            throw new UnsupportedOperationException("No puede calcularse el fibonacci de un número negativo");
        }
        
        return fibonacciBinario(k);
    }
}
