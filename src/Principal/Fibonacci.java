/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Sam Velasquez
 */
public class Fibonacci {

    int fibonacciRecursivo(int i) {

        return i < 2 ? i : fibonacciRecursivo(i - 1) + fibonacciRecursivo(i - 2);

    }

    

    void fibonacciRecursivoIterado(int j) {

        for (int i = 0; j > i; i++) {
            System.out.println(new Fibonacci().fibonacciRecursivo(i));
        }
    }

    void fibonacci() {
        int i = 0;
        int j = 1;
        System.out.println(i + "\n" + j);
        while (j < 89) {
            i += j;
            System.out.println(i);
            j += i;
            System.out.println(j);
        }

    }
}
