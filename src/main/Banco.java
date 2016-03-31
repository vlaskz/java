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

    protected Conta[] c;

    public Banco(int n) {
        this.c = new Conta[n];
    }

    public void addConta(Conta conta){
        Ferramentas fer = new Ferramentas();
        c = fer.avaliarArray(c);
        c[fer.posLivreArray(c)] = conta;
        
    }
}
