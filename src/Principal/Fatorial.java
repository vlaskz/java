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
public class Fatorial {

    int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int r = fatorial(n - 1) * n;
        return r;

    }
}