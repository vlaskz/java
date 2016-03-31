/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sam Velasquez
 */
public class Banco {

    int n = 0;
    protected Conta[] c = new Conta[n];

    public Banco(int n) {
        this.c = new Conta[n];
    }

}
